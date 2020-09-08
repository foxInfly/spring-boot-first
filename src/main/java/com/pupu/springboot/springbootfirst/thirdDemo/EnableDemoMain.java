package com.pupu.springboot.springbootfirst.thirdDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author : lipu
 * @since : 2020-09-08 00:14
 */
@SpringBootApplication
@EnableDefineService
//@EnableDefineService(exclude = {LoggerService.class})
public class EnableDemoMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(EnableDemoMain.class, args);

        System.out.println(ca.getBean(CacheService.class));
        System.out.println(ca.getBean(LoggerService.class));

    }


}
