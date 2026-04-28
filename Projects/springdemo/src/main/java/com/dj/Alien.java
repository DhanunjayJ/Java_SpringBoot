package com.dj;

public class Alien {

    private int age;
    private Laptop lap;

    public int getAge() {
        return age;
    }
   
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public void setAge(int age) {
        System.out.println("Spring is setting the values using setter");
        this.age = age;
    }

    public Alien(){
        System.out.println("Alien Object Created");
    }

    public void code (){
        System.out.println("Coding");
        lap.compile();
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
