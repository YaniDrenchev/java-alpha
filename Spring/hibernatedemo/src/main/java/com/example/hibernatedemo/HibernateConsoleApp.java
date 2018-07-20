package com.example.hibernatedemo;

import com.example.hibernatedemo.models.Address;
import com.example.hibernatedemo.models.Employee;
import com.example.hibernatedemo.models.Town;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateConsoleApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Town.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Address.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
//ADDING TO DB
//        Employee newEmployee = new Employee("Petar", "Raykov", "project");
//        session.save(newEmployee);
//        session.getTransaction().commit();
//        session.close();
//READING FROM DB
//        Employee e = session.get(Employee.class, 1);
//        System.out.println(
//                e.getFirstname() +" " +  e.getId() + " " + e.getJobTitle()
//        );
//        session.getTransaction().commit();
//        session.close();
//DELETING FROM DB
//        Town town= new Town("sofia");
//        session.save(town);
//        Town t = session.get(Town.class, 33);
//        session.delete(t);
//READING WITH QUERY DB
//        List<Town> towns = session.createQuery("FROM Town").list();
//        towns.stream().forEach(System.out::println);
//        session.getTransaction().commit();
//        session.close();
//        session.close();
//UPDATE
//       int results = session.createQuery("delete from Town where name ='sofia'").executeUpdate();
//        session.getTransaction().commit();
//        session.close();
//        System.out.println(results);
        List employees = session.createQuery("From Employee").list();
        employees.stream().forEach(System.out::println);
        session.getTransaction().commit();
        session.close();

    }
}
