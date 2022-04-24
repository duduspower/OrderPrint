package com.example;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinTable
    private PersonalData personalData;

    @ManyToMany
    @JoinTable
    private Adress adreses;

    @ManyToMany
    @JoinTable
    private CreditCard creditCards;

    @OneToMany
    @JoinTable
    private Order orders;

    public User() {
    }

    public User(PersonalData personalData, Adress adreses, CreditCard creditCards, Order orders) {
        this.personalData = personalData;
        this.adreses = adreses;
        this.creditCards = creditCards;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public Adress getAdreses() {
        return adreses;
    }

    public void setAdreses(Adress adreses) {
        this.adreses = adreses;
    }

    public CreditCard getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(CreditCard creditCards) {
        this.creditCards = creditCards;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }
}
