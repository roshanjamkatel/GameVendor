package com.group7ooec.gamevendor.model;

public class Game {

    private int id;
    private String name;

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

    public Game(int id) {
        this.id = id;
    }
}
