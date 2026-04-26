package com.dj;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {

    @Id
    private int lid;
    private String brand;
    private String model;
    private String ram;
    @ManyToOne
    private Alien alien;

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getLid() {
        return lid;
    }
    public void setLid(int lid) {
        this.lid = lid;
    }

    @Override
    public String toString() {
        return "Laptop [lid=" + lid + ", brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
    }
   
}
