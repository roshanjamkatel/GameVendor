package com.group7ooec.gamevendor.repository;

import com.group7ooec.gamevendor.model.ForumTopic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ForumTopicRepository extends MongoRepository<ForumTopic, String> {
}
