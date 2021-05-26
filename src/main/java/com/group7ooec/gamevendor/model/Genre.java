package com.group7ooec.gamevendor.model;

import javax.persistence.Id;

public class Genre {
    @Id
    public String id;

    public String name;

    public String image;

    public Genre(String name, String image){
        this.name = name;
        this.image = image;
    }

    @Override
    public String toString(){
        return String.format(
                "Genre[id=%s, name=%s, image=%s]",
                id, name, image);
    }
}
