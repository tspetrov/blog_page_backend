package com.example.blog_page_backend;

import com.example.blog_page_backend.DTOs.AllowedUsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BlogPageBackendApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(BlogPageBackendApplication.class, args);
    }

    @Override
    public void run(String... args) {

    }
}
