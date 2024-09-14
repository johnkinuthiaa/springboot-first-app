package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController

public class Demo2Application {
    @GetMapping("/greetings")
    public String greetings(@RequestParam(value = "name",defaultValue = "kingkadee")String name){
        return String.format("hello %s",name);
    }
    public static void main(String[] args){
        SpringApplication.run(Demo2Application.class,args);
    }
}

