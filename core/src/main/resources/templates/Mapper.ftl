// generated by sqlni, ${time}
package ${package};

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
<#list imports as import>
import ${import};
</#list>

<#if mapperComment?has_content>
/**
  <#list mapperComment as line>
 *${line}
  </#list>
 */
</#if>
@Mapper
public interface ${mapperName} extends BaseMapper<${entityName}> {

<#list methods as method>
    <#if method.comment?has_content>
    /**
      <#list method.comment as line>
     *${line}
      </#list>
     */
    </#if>
    ${method.returnType} ${method.name}(<#list method.parameters as parameter>@Param("${parameter.name}") ${parameter.type} ${parameter.name}<#if parameter_has_next>, </#if></#list>);

</#list>
}