package com.group7ooec.gamevendor.controller;

import org.springframework.web.bind.annotation.PathVariable;

import com.group7ooec.gamevendor.model.Reviews;
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
    private ReviewRepository reviewRepository;

    @GetMapping("/games")
    public String showAll(Model model){
        model.addAttribute("games", gameRepository.findAll());

        return "games/list";
    }
    // double check
    @GetMapping("/detailedView")
    public String showGameDetails(Model game) {
        game.addAttribute("games", gameRepository.findAll());
        return "games/detailedView";
    }

    // Find reviews for given game
    @GetMapping("/detailedView?game={game}")
    public String showReviewDetails(Model review) {
        review.addAttribute("reviews", reviewRepository.findAll());
        return "/detailedView?game={game}";
    }

    @GetMapping("/")
    public String helloGame() {
        return "home";
    }
}
