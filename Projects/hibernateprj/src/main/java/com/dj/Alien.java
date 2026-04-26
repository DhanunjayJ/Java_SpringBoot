package com.dj;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    private String tech;
    //without this both will create two tables we jsut need one
    //same as before like one to many
    @ManyToMany
    private List<Laptop> laptops;

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
   
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + ", laptop=" + laptops + "]";
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }
    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    
}
