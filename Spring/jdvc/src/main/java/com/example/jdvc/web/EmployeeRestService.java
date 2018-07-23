package com.example.jdvc.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestService {
    @RequestMapping("/")
    void getAll(){
        String dbUrl = "jdbc:mysql://localhost:3306/telerikacademy";
        String username = "defuser";
        String pass = "defuser";

        try(Connection connection =DriverManager.getConnection(dbUrl, username, pass);) {
            System.out.println("connection created");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("connection failed");
        }
    }
}
