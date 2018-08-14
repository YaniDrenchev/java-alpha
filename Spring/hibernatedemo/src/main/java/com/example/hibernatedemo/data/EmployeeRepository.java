package com.example.hibernatedemo.data;

import com.example.hibernatedemo.models.Employee;

import java.util.List;

public interface EmployeeRepository {
     List<Employee> getAll();
     Employee findById(int id);
     void delete(int id);
}
