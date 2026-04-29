package com.dj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")
    private int age;
    
    @Autowired //asking the spring to go to container and find the object there. 
    @Qualifier("laptop") //since we have two objects of the same type we need to 
    //mention the qualifier
    //name is same is the object name you can change the name
    // in after component ().
    private Computer com;

    /*
    Here we are using the @Autowire on the field
    this is a filed injection. 

    if we do it by constructor injection

    @Autowire
    Alien(Computer com){
    }

    we can do the same thing by setter injections
    @Autowire
    //on the setter methond of the computer. 

    Field injection is prefered. 
    */

    public int getAge() {
        return age;
    }

    public Alien(){
        
    }
   
    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code (){
        System.out.println("Coding");
        com.compile();
    }

    public Computer getCom() {
        return com;
    }

    // @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }
}
