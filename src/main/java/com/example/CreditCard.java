package com.example;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity

public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany
    @JoinColumn(name = "user_id")
    private Set<User> users = new HashSet<>();

    private String creditCardNumber;
    private String expirationDate;
    private int ccvNumber;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CreditCard() {
    }

    public CreditCard(Set<User> users, String creditCardNumber, String expirationDate, int ccvNumber, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.users = users;
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
        this.ccvNumber = ccvNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @PrePersist
    private void createdAt(){
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    private void updatedAt(){
        this.updatedAt = LocalDateTime.now();
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
