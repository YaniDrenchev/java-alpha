package com.example.hibernatedemo;

import com.example.hibernatedemo.models.Employee;
import com.example.hibernatedemo.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.TemplateEngine;

import javax.persistence.TableGenerator;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
//@RequestMapping("/api/employees")
public class EmployeeRestControler {

    private EmployeeService service;
    @Autowired
    public EmployeeRestControler(EmployeeService service) {
        this.service = service;
    }
    @GetMapping("/")
    public List<Employee> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable("id") String id){
        return service.getById(Integer.parseInt(id));
    }

    @GetMapping("/delete/{id}")
    public void delete (@PathVariable("id") String id ){
        service.delete(Integer.parseInt(id));
    }
    @GetMapping("/update")
    public void update(@RequestParam(value = "id") String id,
                       @RequestParam(value = "name") String name){

    }

    @GetMapping("/")
    public  String index(){
        return "index";
    }
}
