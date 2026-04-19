package com.dj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student s1 = new Student();
        s1.setsName("Dhay");
        s1.setsAge(24);
        s1.setRollNo(24);

        // Configuration cfg = new Configuration();
        // cfg.addAnnotatedClass(com.dj.Student.class);
        // cfg.configure(); 


        SessionFactory sf = new Configuration().addAnnotatedClass(com.dj.Student.class)
        .configure()
        .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();
        session.close();

        System.out.println(s1);
    }
}
