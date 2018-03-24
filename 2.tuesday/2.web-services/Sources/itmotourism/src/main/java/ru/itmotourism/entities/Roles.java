package ru.itmotourism.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles {
    private int id;
    private String roleName;
    private String userName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String role_id) {
        this.userName = role_id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
