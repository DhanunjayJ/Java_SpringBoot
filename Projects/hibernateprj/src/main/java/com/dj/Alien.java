package com.dj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

// @Entity(name="alien_table") -> this iwll change the enitty name
@Entity
@Table(name = "alien_table") //this will only change the table name.
public class Alien {

    @Id
    private int aid;

    @Column(name="alien_name")
    private String aname;

    @Transient //using this will not create the column tech in the table
    private String tech;
    //to only store data in the object not in the database
    //to achive that we need transient.

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

    
}
