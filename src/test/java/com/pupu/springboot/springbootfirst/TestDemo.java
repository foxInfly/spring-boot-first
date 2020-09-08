package com.pupu.springboot.springbootfirst;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * @author lipu
 * @since 2020-09-08 10:06:34
 */
public class TestDemo {

    @Test
    public void test1(){
        String aa = "SpringBoot";
        String s = StringUtils.uncapitalize(aa);//首字母小写
        String s1 = StringUtils.capitalize(aa);
        System.out.println(s);
        System.out.println(s1);
    }

}
