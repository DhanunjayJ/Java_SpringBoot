package com.dj;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("apple");
        l1.setModel("M2");
        l1.setRam("16");


        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("apple1");
        l2.setModel("M12");
        l2.setRam("32");


        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("dhanunjay");
        a1.setTech("Java");
        a1.setLaptops(Arrays.asList(l1,l2));

        l1.setAlien(a1);
        l2.setAlien(a1);

        SessionFactory sf = new Configuration().addAnnotatedClass(com.dj.Alien.class)
        .addAnnotatedClass(com.dj.Laptop.class)
        .configure()
        .buildSessionFactory();

        Session session = sf.openSession();
       
        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(a1);
        
        transaction.commit();

        // Alien a2 = session.find(Alien.class,102);

        System.out.println(a1);

        session.close();
     
    }
}
