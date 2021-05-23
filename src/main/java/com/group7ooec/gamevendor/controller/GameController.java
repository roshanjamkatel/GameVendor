package com.group7ooec.gamevendor.controller;

import org.springframework.web.bind.annotation.PathVariable;


import com.group7ooec.gamevendor.repository.GameRepository;
import com.group7ooec.gamevendor.repository.ReviewRepository;

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
    
    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("/games")
    public String showAll(Model model){
        model.addAttribute("games", gameRepository.findAll());

        return "games/list";
    }
    
    
    @GetMapping("/detailedView")
    public String showGameDetails(Model game) {
        game.addAttribute("games", gameRepository.findAll());
        return "games/detailedView";
    }

    @GetMapping("/gameReview")
    public String showGameReviews(Model game, Model review) {
        game.addAttribute("games", gameRepository.findAll());
        review.addAttribute("reviews", reviewRepository.findAll());
        return "games/gameReview";
    }

    @GetMapping("/")
    public String helloGame() {
        return "home";
    }


    @GetMapping("/signup")
    public String signupUser() {
        return "signup";
    }
}
