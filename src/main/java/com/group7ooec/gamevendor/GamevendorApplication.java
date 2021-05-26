package com.group7ooec.gamevendor;

import com.group7ooec.gamevendor.model.Genre;
import com.group7ooec.gamevendor.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GamevendorApplication implements CommandLineRunner {

    @Autowired
    private GenreRepository genreRepository;

    public static void main(String[] args) {
        SpringApplication.run(GamevendorApplication.class, args);
    }

    @Override
    public void run(String ...args) throws Exception {
        genreRepository.deleteAll();

        genreRepository.save(new Genre("Battle Royale", "fn.jpeg"));
        genreRepository.save(new Genre("Tactical Shooter", "valorant.jpeg"));
        genreRepository.save(new Genre("FPS", "cod.jpeg"));
        genreRepository.save(new Genre("Strategy", "aoe.jpeg"));

        // fetch all customers
        System.out.println("Genres found with findAll():");
        System.out.println("-------------------------------");
        for (Genre genre : genreRepository.findAll()) {
            System.out.println(genre);
        }
        System.out.println();
    }

}
