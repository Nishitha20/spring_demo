package com.example.demo.controllers;


import org.springframework.web.bind.annotation.*;
@RequestMapping("")
@RestController
public class HealthController {


    @GetMapping("/hello")
    public String health() {
        return "hello world";
    }
}
