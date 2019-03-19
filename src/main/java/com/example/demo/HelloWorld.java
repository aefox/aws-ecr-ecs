package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
    @RequestMapping(path = "/hello")
    public String helloWorld() {
        return "world";
    }
}
