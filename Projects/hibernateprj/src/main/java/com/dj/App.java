package com.dj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

        //fetching
        Student s2 = null;


        SessionFactory sf = new Configuration().addAnnotatedClass(com.dj.Student.class)
        .configure()
        .buildSessionFactory();

        Session session = sf.openSession();

        s2 = session.find(Student.class,21);

        session.close();

        System.out.println(s2);
    }
}
