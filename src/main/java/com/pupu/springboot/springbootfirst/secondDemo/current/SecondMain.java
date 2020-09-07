package com.pupu.springboot.springbootfirst.secondDemo.current;

import com.pupu.springboot.springbootfirst.firstDemo.DemoClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : lipu
 * @since : 2020-09-07 23:21
 */
//@ComponentScan//默认本包及以下,特殊的需要制定
@ComponentScan("com.pupu.springboot.pringbootfirst")
public class SecondMain {

    public static void main(String[] args) {
        //创建IOC容器
        AnnotationConfigApplicationContext application = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] definitionNames = application.getBeanDefinitionNames();
        System.out.println(definitionNames.length);
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
//        DemoClass demoClass = application.getBean(DemoClass.class);//DL
//        demoClass.say();
    }
}
