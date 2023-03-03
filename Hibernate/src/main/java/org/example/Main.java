package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.lang.module.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product product = new Product("Milk");

        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration()
                                                .configure()
                                                .addAnnotatedClass(Product.class)
                                                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
//        session.save(product);
        Product p = session.get(Product.class,2);
        session.getTransaction().commit();
        session.close();

//        Session session2 = sessionFactory.openSession();
//        session2.beginTransaction();
////        session.save(product);
//        Product p1 = session2.get(Product.class,2);
//        session2.getTransaction().commit();
//        session2.close();
//        System.out.println(p);
//        System.out.println(p1);

        SessionFactory sessionFactory1 = new org.hibernate.cfg.Configuration()
                                .configure("hibernate.cfg1.xml")
                                .addAnnotatedClass(Order.class)
                                .buildSessionFactory();
        Session session3 = sessionFactory1.openSession();
        session3.beginTransaction();
//        session.save(product);
//        Product p3 = session3.get(Product.class,2);
        session3.getTransaction().commit();
        session.close();
    }
}