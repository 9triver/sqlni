# Sqlni

> 基于 mybatis dynamic sql 实现的 DSL 工具（Java API）







自定义条件，



自定义数据类型



自定义函数



综上实现 SQL 模板（参考 QueryDSL）







// ============================ draft ============================

尝试定义用户优化的统一 API 

## DSL

> https://zhuanlan.zhihu.com/p/110789982

### **DSL 的类别**

从使用方式的角度，语言可以划分出以下两类：

- DSL：使用 DSL 形式编写或表示的语言
- 宿主语言host language ：用于执行或处理 DSL 的语言



```xml
<select id="getEmployee" resultType="com.kekwy.mybatis.Employee">
select * from t_employee where type=#{type}
<if test="nameDepartmentSet != null">
and
<foreach collection="nameDepartmentSet" index="index" item="nd" open=" " separator="or" close=" "> name||'_'||department=#{nd} </foreach>
</if>
</select>
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



## 参考资料

https://mybatis.org/mybatis-dynamic-sql/docs/select.html

《SQL 必知必会》—— 本·福达 著