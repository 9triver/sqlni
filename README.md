# SQLNI

> 基于 Mybatis 实现对不同方言数据库编写统一查询的 DSL 语言工具。
>
> 示例仓库：[Kekwy/sqlni-examples](https://github.com/Kekwy/sqlni-examples)
>
> 进度记录：
>
> 第 3 周（2024.1.15 - 2024.1.21）：[定义 SQLNI 语法](reports/w3.md)

## 1 项目简介

## 2 快速开始



## 参考资料

[1] MyBatis Dynamic SQL[EB/OL]. https://mybatis.org/mybatis-dynamic-sql/docs/introduction.html

[2] IntoTw. Java编译期注解处理器详细使用方法[EB/OL]. https://www.cnblogs.com/intotw/p/13815793.html

[3] baeldung. Java Annotation Processing and Creating a Builder[EB/OL]. https://www.baeldung.com/java-annotation-processing-builder

[4] 正则表达式 - 语法[EB/OL]. https://www.runoob.com/regexp/regexp-syntax.html

[5] [美]本·福达. SQL 必知必会(第 5 版)[M]. 钟鸣, 刘晓霞, 译. 北京: 人民邮电出版社, 2020.8

[6] [美]特恩斯·帕尔. ANTLR 4 权威指南[M]. 张博, 译. 北京: 机械工业出版社, 2017.5

[7] [美]Eckel, B. Java 编程思想(第 4 版)[M]. 陈昊鹏, 译. 北京: 机械工业出版社, 2007.6























## ANTLR 使用笔记（暂存草稿）

### 词法分析

**编写词法规则**：

- 语法分析器通过输入的词法符号流来识别特定的语言结构，而词法分析器通过输入的字符流来识别特定的语言结构。
- 开始编写一个新语法的时候，可以从一个已有的语法中复制一些常见的词法结构对应的规则：标识符、数字、字符串、注解，以及空白字符。
- 对于关键字、运算符和标点符号，我们一般无须声明词法规则，直接在语法规则中用单引号使用即可。但通过定义词法规则来引用，可以将语法规则与具体的词法表达解耦合。

**避免歧义**：

- 如 'enum' 这样的字符串常量被隐式定义为词法规则，然后放置在文法规则之后、显式定义的词法规则之前；
- 定义靠前的词法规则优先级更高；
- ID 等引起歧义的，可以匹配关键字的词法规则应该放在最后。



`fragment` 标注的词法规则本身不是一个词法符号，它只会被其他的词法规则使用。

**匹配字符串常量**：

```antlr
STRING : '\'' (ESC|.)*? '\'';     // 匹配字符常量，? 提供了对非贪婪匹配的支持

fragment
ESC : '\\"' | '\\\\';       // 双字符序列 \" 和 \\
```

实现上下文相关的语法

### 划定词法分析其和语法分析器的界线

**无扫描器的语法分析器**：把字符看作词法符号，然后用语法分析器来分析字符流的语法结构。

- 在词法分析器中匹配并丢弃任何语法分析器无须知晓的东西；
- 由词法分析器来匹配类似标识符、关键字、字符串和数字等常见词法符号；
- 将语法分析器无须区分的词法结构归为同一个词法符号类型；
- 将任何语法分析器可以以相同方式处理的实体归为一类；
- 如果语法分析器需要把一种类型的文本拆开处理，那么词法分析器就应该将它的各组成部分作为独立的词法符号输送给语法分析器。

语法分析器无须区分特定的词法结构或者无须关心某个词法结构的内容时，实际上的意思是我们编写的程序不关心它们。我们编写的程序对这些词法结构进行的处理和翻译工作和语法分析器相同。



尾递归/循环



### 不区分大小写的关键字

```antlr
SELECT: [Ss][Ee][Ll][Ee][Cc][Tt]
```





## DSL 相关定义（暂存草稿）

> https://zhuanlan.zhihu.com/p/110789982

### **DSL 的类别**

从使用方式的角度，语言可以划分出以下两类：

- DSL：使用 DSL 形式编写或表示的语言
- 宿主语言host language ：用于执行或处理 DSL 的语言

## 定义API过程的第一个例子（暂存草稿）

```xml
<select id="getEmployee" resultType="com.kekwy.mybatis.Employee">
  select * from t_employee where type=#{type}
  <if test="nameDepartmentSet != null">
    and
    <foreach collection="nameDepartmentSet" index="index" item="nd" open=" " separator="or" close=" ">         name||'_'||department=#{nd} 
    </foreach>
  </if>
</select>
```



```text
select * from t_employee where type = #{employeeType} and #|#&{"name":"foreach","attributes":{"close":" ","item":"departmentNameSetItem","separator":"or","open":" ","index":"index","collection":"departmentNameSet"}}#&concat(department, '_', name)=#{departmentNameSetItem}#|
```





## 问题记录

> https://mybatis.org/mybatis-dynamic-sql/docs/select.html

![image-20240110143400804](README.assets/image-20240110143400804.png)

使用 Java API 表达字符串拼接

> https://mybatis.org/mybatis-dynamic-sql/docs/functions.html

![image-20240110163131783](README.assets/image-20240110163131783.png)

对 MyBatis Dynamic SQL 进行拓展

> https://mybatis.org/mybatis-dynamic-sql/docs/extending.html

![image-20240110191749578](README.assets/image-20240110191749578.png)

可以非常方便地对拥有不同方言的数据库进行拓展：

![image-20240110192554695](README.assets/image-20240110192554695.png)



![image-20240110192651914](README.assets/image-20240110192651914.png)



建造者模式、访问者模式



关于静态方法的记录



尝试读懂 mybatis dynamic SQL 的源码（qwq

自己从头定义一套 API 实在是太要命了。。。



很多都是以流的方式定义的：

![image-20240110234636429](README.assets/image-20240110234636429.png)

访问者模式：

![image-20240111000330078](README.assets/image-20240111000330078.png)



使用 Java 的记录



修改部分 mybatis dynamic sql 的源码



以目前对源码的理解程度，不能保证向外传出结构化对象的方法是可行的，故首先保证可以以传出字符串的方式实现功能。



不改变开发模式



![image-20240111171515936](README.assets/image-20240111171515936.png)


暂时不考虑与 XML 的解耦合问题，

生成过程与具体的 XML 格式解耦可以更好地满足 OCP

**2024年1月16日**

dot 语言的使用，以及示意图的绘制。
