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
        //sql select * from laptop where ram=32 -> SQL
        //usig hql to get the laptop by ram.
        String brand = "asus";
        // Query<Laptop> query = session.createQuery("from Laptop where ram=32",Laptop.class);
        // Query<Laptop> query = session.createQuery("from Laptop where brand name lie ?1 ",Laptop.class);
        // Query<Laptop> query = session.createQuery("select model from Laptop where brand name lie ?1 ",Laptop.class);
        Query<Laptop> query = session.createQuery("select brand,model from Laptop where brand name lie ?1 ",Laptop.class);
        query.setParameter(1, brand);
        List<Laptop> laptops = query.getResultList();

        System.out.println(laptops);

        session.close();
    }
}
