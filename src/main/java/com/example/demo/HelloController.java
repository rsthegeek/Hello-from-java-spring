package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
    @GetMapping("/")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        System.out.println(name);
        return "Hello, " + name + "!";
    }
}