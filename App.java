package com.klu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klu.model.Product;
import com.klu.util.HibernateUtil;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p = new Product("Laptop", 55000);
        session.save(p);

        tx.commit();
        session.close();

        System.out.println("Product inserted successfully");
    }
}
