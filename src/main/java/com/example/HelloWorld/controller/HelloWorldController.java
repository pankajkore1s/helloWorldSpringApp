package com.example.HelloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HelloWorldController {
    @GetMapping("/web")
    public String hello(){
        return "hello";
    }
    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "Welcome To BridgeLabz");
        return "message";
    }
}
