// generated by sqlni, ${time}
package ${package};

import com.baomidou.mybatisplus.extension.service.IService;
<#list imports as import>
import ${import};
</#list>

<#if serviceComment?has_content>
/**
  <#list serviceComment as line>
 *${line}
  </#list>
 */
</#if>
public interface ${serviceName} extends IService<${entityName}> {

}