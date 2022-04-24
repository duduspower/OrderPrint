package com.example;

import javax.persistence.*;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany
    @JoinTable
    private User users;

    private String creditCardNumber;
    private String expirationDate;
    private int ccvNumber;

    public CreditCard() {
    }

    public CreditCard(String creditCardNumber, String expirationDate, int ccvNumber) {
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
        this.ccvNumber = ccvNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCcvNumber() {
        return ccvNumber;
    }

    public void setCcvNumber(int ccvNumber) {
        this.ccvNumber = ccvNumber;
    }
}
