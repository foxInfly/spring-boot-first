package com.pupu.springboot.springbootfirst.firstDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : lipu
 * @since : 2020-09-07 23:21
 */
public class ConfigurationMain {

    public static void main(String[] args) {
        //创建IOC容器
        AnnotationConfigApplicationContext application = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        DemoClass demoClass = application.getBean(DemoClass.class);//DL
        demoClass.say();
    }
}
