package com.capgemini.repository;

import com.capgemini.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentRepository {

    private static SessionFactory sessionFactory;

    static {
        Configuration configuration =
                new Configuration()
                        .configure()
                        .addAnnotatedClass(Student.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }
}