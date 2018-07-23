package com.example.hibernatedemo.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeId")
    private int id;

    @Column(name = "FirstName")
    private String firstname;
    @Column(name = "LastName")
    private String lastname;
    @Column(name = "jobTitle")
    private String jobTitle;
    public Employee(){

    }

    public Employee(String firstname, String lastname, String jobTitle) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return String.format("%d, %s , %s,",id, firstname, lastname);
    }
}
