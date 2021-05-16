package com.group7ooec.gamevendor.service;

import com.group7ooec.gamevendor.model.Game;
import com.group7ooec.gamevendor.repository.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Min;
import java.util.Optional;

@Service
@Transactional
public class GameServiceImpl implements GameService {
    private GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }
    @Override
    public Iterable<Game> getAllGames() {
        return gameRepository.findAll();

    }
    @Override
    public Optional<Game> getGame(@Min(value = 1L, message = "Invalid game ID.") long id) {
        return gameRepository.findById(id);

    }

    @Override
    public Game save(Game game) {
        return gameRepository.save(game);
    }

}
