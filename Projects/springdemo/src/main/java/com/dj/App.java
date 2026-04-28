package com.dj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //this will create a container for you.
        //and saying that go that xml file and create all the objects
        //that are being mentioned in the spring.xml as beans.
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
        //get the object from the container.
        
        Alien obj = (Alien) context.getBean("alien");
        obj.age = 21;
        System.out.println(obj.age);
        // obj.code();

        //even if you create this it will only create one object.
        Alien obj1 = (Alien) context.getBean("alien");
        // obj1.code();
        System.out.println(obj1.age);
        //prints the same value 21 since by default it is singleton
        //after changing the scope to the prototype it will create two 
        //objects. 
        // single ton beans objects are created when we intalise the applicaoitn 
        // context but for prototype the objects will only
        //be created when we call getBean.
        
    }
}
