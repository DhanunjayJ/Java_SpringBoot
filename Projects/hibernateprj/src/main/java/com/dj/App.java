package com.dj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {

        Laptop l1 = new Laptop();
        l1.setBrand("apple");
        l1.setModel("M2");
        l1.setRam("16");

        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname("dhanunjay");
        a1.setTech("Java");
        a1.setLaptop(l1);
        SessionFactory sf = new Configuration().addAnnotatedClass(com.dj.Alien.class)
        .configure()
        .buildSessionFactory();

        Session session = sf.openSession();
       
        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

        Alien a2 = session.find(Alien.class,102);

        System.out.println(a2);
        
        session.close();
     
    }
}
