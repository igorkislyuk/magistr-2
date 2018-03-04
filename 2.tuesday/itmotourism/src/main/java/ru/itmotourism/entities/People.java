package ru.itmotourism.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class People {

    private int id;
    private String name;
    private String surname;
    private String fatherName;
    private String userName;
    private Date bDay;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getbDay() {
        return bDay;
    }

    public String getFatherName() {
        return fatherName;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }



    @Override
    public String toString(){
        return getName()+" "+getSurname()+" "+getFatherName()+" "+getUserName()+" "+getbDay();
    }
}
