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
        //for lazy loading. it won't execute the queury.
        //untill you will print in the or needed. 
        Laptop laptop = session.getReference(Laptop.class).getReference(2);
        System.out.println(laptop);

        session.close();
    }
}
