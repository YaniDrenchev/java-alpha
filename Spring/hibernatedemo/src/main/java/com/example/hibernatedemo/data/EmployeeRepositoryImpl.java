package com.example.hibernatedemo.data;

import com.example.hibernatedemo.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    static SessionFactory factory = null;
    static {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = null;
        try (Session session = factory.openSession()){
            session.beginTransaction();
            employees = session.createQuery("from Employee").list();
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public Employee findById(int id) {
        Employee e = null;
        try (Session session = factory.openSession()){
            session.beginTransaction();
                e = session.get(Employee.class, id);
            session.getTransaction().commit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return e;
    }

    @Override
    public void delete(int id) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            Employee e = session.get(Employee.class, id);
            session.delete(e);
            session.getTransaction().commit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
