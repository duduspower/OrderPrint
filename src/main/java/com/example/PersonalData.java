package com.example;

import liquibase.pro.packaged.I;

import javax.persistence.*;

@Entity
public class PersonalData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String surname;

    private String username;

    @OneToMany
    @JoinTable
    private UserContact userContact;

    public PersonalData() {
    }

    public PersonalData(String name, String surname, String username, UserContact userContact) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.userContact = userContact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserContact getUserContact() {
        return userContact;
    }

    public void setUserContact(UserContact userContact) {
        this.userContact = userContact;
    }
}
