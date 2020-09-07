package com.pupu.springboot.springbootfirst.thirdDemo;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**动态注入Bean
 * @author : lipu
 * @since : 2020-09-08 00:34
 */
public class LoggerDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Class beanClass = LoggerService.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanClass);

        String beanName = StringUtils.uncapitalize(beanClass.getSimpleName());//首字母小写
        registry.registerBeanDefinition(beanName,beanDefinition);
    }
}
