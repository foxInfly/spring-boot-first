package com.pupu.springboot.springbootfirst.thirdDemo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author : lipu
 * @since : 2020-09-07 23:58
 */
public class CacheImportSelector implements ImportSelector {

    /**
     *
     * @param annotationMetadata 注解元数据
     * @return String[]
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String,Object> attributes =
                annotationMetadata.getAnnotationAttributes(EnableDefineService.class.getName());

        //动态注入bean
        String[] strings = {CacheService.class.getName()};
//        if (annotationMetadata. == null) {
//
//        }

        return strings;//返回的是一个固定的CacheService
    }
}
