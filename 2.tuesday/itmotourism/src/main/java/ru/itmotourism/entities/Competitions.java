package ru.itmotourism.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Competitions {

    private int id;
    private String name;
    private Date date;
    private String info;
    private String kindOfSport;
    private String category;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public Date getDate() {
        return date;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return this.getName();
    }
}
