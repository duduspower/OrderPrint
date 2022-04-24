package com.example;

import javax.persistence.*;

@Entity
@Table(name = "app_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinTable
    private User user;

    private float cost;

    @ManyToMany
    @JoinTable
    private Product product;

    public Order() {
    }

    public Order(User user, float cost, Product product) {
        this.user = user;
        this.cost = cost;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
