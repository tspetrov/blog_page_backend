package com.example.blog_page_backend.controllers;

import com.example.blog_page_backend.DTOs.HelloWorldDTO;
import com.example.blog_page_backend.model.CheckValidCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    CheckValidCredentials validateUser;

    @GetMapping("/hello")
    public HelloWorldDTO getHelloWorld () {
        return new HelloWorldDTO(1, "Hello Worlds");
    }

    //
    @GetMapping("/validUser")
    public Boolean isUserValid(@RequestParam String username, @RequestParam String password) {
        System.out.println("username = " + username + ", password = " + password);
        System.out.println(validateUser.checkIfCredentialsAreOk(username, password));
        return true;
    }


}
