package com.example.awsexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
    @GetMapping("/hello")
    public String display(){
        return "This is my Spring AWS example";
    }
}
