package com.dj;

public class Alien {

    private int age;
    private Computer com;

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

    public void setCom(Computer com) {
        this.com = com;
    }
}
