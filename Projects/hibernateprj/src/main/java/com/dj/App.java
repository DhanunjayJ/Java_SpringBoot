package com.dj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Student s1 = new Student();
        // s1.setsName("Dy");
        // s1.setsAge(24);
        // s1.setRollNo(25);

        SessionFactory sf = new Configuration().addAnnotatedClass(com.dj.Student.class)
        .configure()
        .buildSessionFactory();

        Session session = sf.openSession();

        s1 = session.find(Student.class,21);
        //we need transaction here because we are chanign the data 
        //in the database.
        Transaction transaction = session.beginTransaction();

        //for updating.
        //first create a objec to update 
        //if the object or entry is there it will update if not
        //it will create new insert row. 
        // session.merge(s1);

        //deleting an entry from the database
        //first fetch and then delete. 
        session.remove(s1);

        transaction.commit();

        session.close();
        //if there is not element is there, then it will add the new 
        // entry in the database. with insert statmenet.
        //first it will run select and then update. 
        System.out.println(s1);
    }
}
