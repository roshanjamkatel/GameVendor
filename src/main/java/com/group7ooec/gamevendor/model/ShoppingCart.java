package com.group7ooec.gamevendor.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "Quantity")
    private int quantity;                

    @Column(name = "image")
    private String image;

    public double getPrice() {
        return price * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
