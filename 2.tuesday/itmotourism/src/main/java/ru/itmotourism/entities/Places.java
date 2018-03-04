package ru.itmotourism.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Places {

    private int id;
    private Integer peopleId;
    private Integer competitionId;
    private Integer place;
    private String time;
    private int gap;
    private int startNumber;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public Integer getCompetitionId() {
        return competitionId;
    }

    public Integer getPeopleId() {
        return peopleId;
    }

    public Integer getPlace() {
        return place;
    }

    public int getGap() {
        return gap;
    }

    public String getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPeopleId(Integer peopleId) {
        this.peopleId = peopleId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }


    public int getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
