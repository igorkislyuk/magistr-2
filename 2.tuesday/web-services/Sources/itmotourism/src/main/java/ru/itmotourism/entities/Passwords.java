package ru.itmotourism.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passwords {
    @Id
    private String userName;

    private String password;

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String  password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
