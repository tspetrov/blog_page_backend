package com.example.blog_page_backend;

import com.example.blog_page_backend.DBManager.AllowedUsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BlogPageBackendApplication implements CommandLineRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(BlogPageBackendApplication.class, args);
    }

    @Override
    public void run(String... args) {
        String sql = "select * from blogging_app_user.allowed_users;";


        System.out.println(jdbcTemplate.queryForObject(sql, new Object[]{}, (rs, rowNum) ->
                new AllowedUsersDTO(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("fullname")
                )).toString());
    }
}
