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

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("apple3");
        l3.setModel("M13");
        l3.setRam("64");

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("dhanunjay");
        a1.setTech("Java");

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("dj");
        a2.setTech("python");


        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l3));



        SessionFactory sf = new Configuration().addAnnotatedClass(com.dj.Alien.class)
        .addAnnotatedClass(com.dj.Laptop.class)
        .configure()
        .buildSessionFactory();

        Session session = sf.openSession();
       
        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(a2);
        session.persist(a1);
        
        transaction.commit();

        session.close();

        Session session1 = sf.openSession();
        Alien a5 = session1.find(Alien.class,101);
        //if you ask it will fetch the data of the laptop. if not it won't fetch. 
        //by default it is lazy.
        // System.out.println(a5);
        session1.close();
    }
}
