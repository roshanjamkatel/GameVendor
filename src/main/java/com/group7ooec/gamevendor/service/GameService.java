package com.group7ooec.gamevendor.service;

import com.group7ooec.gamevendor.model.Game;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Validated
public interface GameService {
    @NotNull Iterable<Game> getAllGames();

    Optional<Game> getGame(@Min(value = 1L, message = "Invalid game ID.") long id);

    Game save(Game product);


}
