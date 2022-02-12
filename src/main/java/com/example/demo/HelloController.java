package com.example.demo;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("rao");
		arrayList.add("lin");
		arrayList.add("hu");
        return "hello springBoot";
    }

    @GetMapping("/login")
    public String login(){
        return "<h1>hello login</h1>";
    }

    @RequestMapping("index")
    public String index(){
		System.out.print("raolinhu\n");
		System.out.println("abc");
        return "/index/index.html";
    }

    @GetMapping("/health")
    public String health(){
        return "hello, health page";
    }

    @GetMapping("/people")
    public String people(){
        return "hello, people page";
    }



}
