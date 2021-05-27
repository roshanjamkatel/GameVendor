package com.group7ooec.gamevendor.repository;

import com.group7ooec.gamevendor.model.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogPostRepository extends MongoRepository<BlogPost, String> { }
