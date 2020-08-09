package com.example.demo;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello springBoot";
    }

    @GetMapping("/login")
    public String login(){
        return "<h1>hello login</h1>";
    }

    @GetMapping("/index")
    public String index(){
        return "index page";
    }

    @GetMapping("/health")
    public String health(){
        return "health page";
    }
}
