package com.pupu.springboot.springbootfirst.secondDemo.current;

import com.pupu.springboot.springbootfirst.secondDemo.other.OtherConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : lipu
 * @since : 2020-09-07 23:48
 */
@Import(OtherConfig.class)//加入第三方依赖配置
@Configuration
public class SpringConfig {


    @Bean
    public DefaultBean defaultBean(){
        return  new DefaultBean();
    }
}
