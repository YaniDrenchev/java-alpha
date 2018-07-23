package com.example.hibernatedemo.web.services;

import com.example.hibernatedemo.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getById(int id);
    void delete(int id);
}
