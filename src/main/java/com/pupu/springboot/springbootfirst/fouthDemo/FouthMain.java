package com.pupu.springboot.springbootfirst.fouthDemo;

import com.pupu.core.GupaoCore;
import com.pupu.springboot.springbootfirst.thirdDemo.CacheService;
import com.pupu.springboot.springbootfirst.thirdDemo.EnableDemoMain;
import com.pupu.springboot.springbootfirst.thirdDemo.LoggerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author : lipu
 * @since : 2020-09-08 18:31
 */
@SpringBootApplication
public class FouthMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(EnableDemoMain.class, args);

        System.out.println(ca.getBean(GupaoCore.class));
        ca.getBean(GupaoCore.class).study();

    }
}
