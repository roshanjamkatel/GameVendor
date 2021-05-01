package com.group7ooec.gamevendor.repository;

import com.group7ooec.gamevendor.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface GameRepository extends CrudRepository<Game, Long> {

}
