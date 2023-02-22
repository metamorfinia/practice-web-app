package com.example.WebApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping(path = "/greeting")
    public String getGreeting() {
        return "Hi, it's me Maryna, and I like languages.";
    }
}
