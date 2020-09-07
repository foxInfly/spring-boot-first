package com.pupu.springboot.springbootfirst.secondDemo.other;

import com.pupu.springboot.springbootfirst.secondDemo.current.DefaultBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : lipu
 * @since : 2020-09-07 23:48
 */
@Configuration
public class OtherConfig {


    @Bean
    public OtherConfig defaultBean(){
        return  new OtherConfig();
    }
}
