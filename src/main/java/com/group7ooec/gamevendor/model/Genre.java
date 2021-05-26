package com.group7ooec.gamevendor.model;

import javax.persistence.Id;

public class Genre {
    @Id
    public String id;

    public String name;

    public Genre(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format(
                "Genre[id=%s, name=%s]",
                id, name);
    }
}
