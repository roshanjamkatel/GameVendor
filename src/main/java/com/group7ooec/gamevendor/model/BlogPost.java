package com.group7ooec.gamevendor.model;

import javax.persistence.Id;

public class BlogPost
{

    @Id
    public String id;

    public String authorName;

    public String content;

    public String title;

    public String description;

    public String image;

    public BlogPost(String authorName, String content, String title, String description, String image){
        this.authorName = authorName;
        this.content = content;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    @Override
    public String toString(){
        return String.format("BlogPost[id=%s, author=%s, title=%s", id, authorName, title);
    }
}
