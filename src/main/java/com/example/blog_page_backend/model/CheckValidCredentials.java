package com.example.blog_page_backend.model;

import com.example.blog_page_backend.DTOs.AllowedUsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class CheckValidCredentials {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public  boolean checkIfCredentialsAreOk(String username, String password) {


        String sql = "select * from blogging_app_user.allowed_users where username = ? and password = ?;";

        SqlParameterSource namedParameters = new MapSqlParameterSource()
                .addValue("username", username)
                .addValue("password", password);




        System.out.println(jdbcTemplate.queryForObject(sql, new Object[]{username, password}, (rs, rowNum) ->
                new AllowedUsersDTO(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("fullname"),
                        rs.getString("password")
                )).toString());
        return false;
    }
}
//mySecretPassword
//CECO