package com.example.hibernatedemo.models;



import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentId")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "managerID")
    private int managerId;
}
