package com.group7ooec.gamevendor.service;

import com.group7ooec.gamevendor.model.Game;
import com.group7ooec.gamevendor.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

}
