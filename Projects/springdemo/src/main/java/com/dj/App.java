package com.dj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
        
        // Alien obj = (Alien) context.getBean("alien");
        //another way to get bean
        Alien obj = context.getBean("alien",Alien.class);
        //search by type.
        //you can remove the id in the beam
        // Desktop obj1 = context.getBean(Desktop.class);
        //this will give error becaause there are two beans of the type computer. 
        // so we need to specify primary or name here. 
        // Computer obj2 = context.getBean(Computer.class);
        System.out.println(obj.getAge());
        obj.code();

    }
}
