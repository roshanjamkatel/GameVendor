package com.group7ooec.gamevendor.controller;

import com.group7ooec.gamevendor.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/games")
    public String showAll(Model model){
        model.addAttribute("games", gameRepository.findAll());

        return "games/list";
    }


    @GetMapping("/")
    public String helloGame() {
        return "home";
    }
}
