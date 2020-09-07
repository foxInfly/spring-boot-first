package com.pupu.springboot.springbootfirst.thirdDemo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author : lipu
 * @since : 2020-09-08 00:00
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited//是否允许被继承
@Import({CacheImportSelector.class,LoggerDefinitionRegistrar.class})
public @interface EnableDefineService {

    //配置一些方法
    Class<?>[] exclude() default {};
}
