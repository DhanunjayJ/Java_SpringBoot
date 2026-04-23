package com.dj;

import jakarta.persistence.Embeddable;

@Embeddable 
public class Laptop {

    private String brand;
    private String model;
    private String ram;

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

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
    }
   
}
