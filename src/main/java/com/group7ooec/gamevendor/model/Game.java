package com.group7ooec.gamevendor.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue
    private long id;
	
	@NotNull(message = "Game name is required.")
    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "genre")
    private String genre;

    @Column(name = "rating")
    private int rating;

    @Column(name = "price")
    private double price;

    @Column(name = "operating_system")
    private String operating_system;
	
    @Column (name = "summary")
    private String summary;
//Constructor
	public Game (Long id, String name, String image, String genre, int rating, double price, String op, String summary){
		this.id = id;
		this.name =name;
		this.image = image;
		this.genre = genre;
		this.rating = rating;
		this.price= price;
		this.operating_system= op;
        this.summary = summary;
	}
	
	public Game() {
    }

//getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}

