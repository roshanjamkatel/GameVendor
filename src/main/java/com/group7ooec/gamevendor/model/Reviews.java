package com.group7ooec.gamevendor.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "game_id")
    private String game_id;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "rating")
    private int rating;

    @Column(name = "review")
    private String review;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return game_id;
    }

    public void setName(String name) {
        this.game_id = game_id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() { return review; }

    public void setReview(String review) { this.review = review; }

    public void setUser(String user) { this.user_id = user; }

    public String getUser() { return user_id;}

    @Override
    public String toString() {
        return String.format("Review=[Review: %s, Rating: %s/10]", review, rating);
    }

}
