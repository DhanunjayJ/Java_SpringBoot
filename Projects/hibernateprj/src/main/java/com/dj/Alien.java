package com.dj;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    private String tech;
    //without mapped by it will create a new table
    //to handle the mapping. so to let the laptop handle it
    //we are saying it is mapped by laptop by usig a variable "alien"
    @OneToMany(mappedBy = "alien")
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
