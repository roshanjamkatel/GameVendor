package com.group7ooec.gamevendor.model;

import javax.persistence.Id;

public class ForumPost {
    @Id
    public String id;

    public String topicId;

    public String authorName;

    public String content;

    public String title;

    public ForumPost(String topicId, String authorName, String content, String title){
        this.topicId = topicId;
        this.authorName = authorName;
        this.content = content;
        this.title = title;
    }

    @Override
    public String toString(){
        return String.format(
          "ForumPost=[id=%s, topicId=%s, title=%s, authorName=%s]", id, topicId, title, authorName
        );
    }
}
