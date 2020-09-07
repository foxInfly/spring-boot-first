package com.pupu.springboot.springbootfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lipu
 * @since : 2020-09-07 23:01
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String sayHello(){
        return "Hello pupu";
    }
}
