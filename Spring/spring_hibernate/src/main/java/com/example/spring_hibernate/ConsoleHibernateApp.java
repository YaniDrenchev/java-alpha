package com.example.spring_hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsoleHibernateApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

    }
}
