package com.dj;

import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf = new Configuration().addAnnotatedClass(com.dj.Alien.class)
        .addAnnotatedClass(com.dj.Laptop.class)
        .configure()
        .buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.find(Laptop.class, 1);
        System.out.println(l1);

        //it will execute the query once because of the l1 cache in the session.
        // Laptop l2 = session.find(Laptop.class, 1);
        // System.out.println(l2);

        session.close();

        // here it wil execute the same query twice because there is not cache for the two 
        //sessions combined!!
        Session session2 = sf.openSession();
        Laptop l2 = session2.find(Laptop.class,1);
        System.out.println(l2);

        session2.close();
        sf.close();
        
    }
}
