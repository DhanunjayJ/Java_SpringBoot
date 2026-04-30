package com.dj.springjdbcdemo.Model;

import org.springframework.stereotype.Component;

@Component
//since the postgress only need name and marks and it genrates the rollno
//on the go we don't need to insert student object when storing the data
//here.
public class StudentDAO {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
}
