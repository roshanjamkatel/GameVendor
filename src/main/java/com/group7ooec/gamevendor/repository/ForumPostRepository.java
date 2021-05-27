package com.group7ooec.gamevendor.repository;

import com.group7ooec.gamevendor.model.ForumPost;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ForumPostRepository extends MongoRepository<ForumPost, String> {
    List<ForumPost> findByTopicId(String topicId);
}
