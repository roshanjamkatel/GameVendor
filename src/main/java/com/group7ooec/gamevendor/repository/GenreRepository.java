package com.group7ooec.gamevendor.repository;

import com.group7ooec.gamevendor.model.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenreRepository extends MongoRepository<Genre, String> {

    public Genre findByName(String name);

}
