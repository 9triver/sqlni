// generated by sqlni, ${time}
package ${package};

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
<#list imports as import>
import ${import};
</#list>

<#if serviceImplComment?has_content>
/**
  <#list serviceImplComment as line>
 *${line}
  </#list>
 */
</#if>
@Service
public class ${serviceImplName} extends ServiceImpl<${mapperName}, ${entityName}> implements ${serviceName} {

}