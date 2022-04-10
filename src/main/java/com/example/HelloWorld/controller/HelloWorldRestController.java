package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    @RequestMapping("/")
    public String index(){
        return "Hello Welcome to World of BridgeLabz";
    }
}
