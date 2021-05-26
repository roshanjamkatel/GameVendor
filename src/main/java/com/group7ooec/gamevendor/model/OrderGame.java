package com.group7ooec.gamevendor.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;


@Entity
public class OrderGame {
    @EmbeddedId
    @JsonIgnore
    private OrderGamePK pk;

    @Column(nullable = false) private Integer quantity;
    public OrderGame() {
        super();
    }
    //Constructor
    public OrderGame(Order order, Game game, Integer quantity) {
        pk = new OrderGamePK();
        pk.setOrder(order);
        pk.setGame(game);
        this.quantity = quantity;
    }
    //getters and setters
    @Transient
    public Game getGame() {
        return this.pk.getGame();
    }
    @Transient
    public Double getTotalPrice() {
        return getGame().getPrice() * getQuantity();
    }
    public OrderGamePK getPk() {
        return pk;
    }
    public void setPk(OrderGamePK pk) {
        this.pk = pk;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    //hashing
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());

        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        OrderGame other = (OrderGame) obj;
        if (pk == null) {
            if (other.pk != null) {
                return false;
            }
        } else if (!pk.equals(other.pk)) {
            return false;
        }

        return true;
    }





}
