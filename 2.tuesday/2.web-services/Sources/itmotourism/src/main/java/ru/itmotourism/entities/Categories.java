package ru.itmotourism.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Categories {
    private int id;
    private String category;
    private String kindOfSport;
    private String orderNumber;
    private int peopleId;
    private Date date;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public int getPeopleId() {
        return peopleId;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPeopleId(int peopleId) {
        this.peopleId = peopleId;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
