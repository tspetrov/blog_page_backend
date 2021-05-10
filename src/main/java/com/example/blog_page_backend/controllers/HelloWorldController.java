package com.example.blog_page_backend.controllers;

import com.example.blog_page_backend.DTOs.HelloWorldDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public HelloWorldDTO getHelloWorld () {
        return new HelloWorldDTO(1, "Hello Worlds");
    }
}
