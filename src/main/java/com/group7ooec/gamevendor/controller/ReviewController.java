package com.group7ooec.gamevendor.controller;

import com.group7ooec.gamevendor.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    // @GetMapping("/detailedView")
    public String showAll(Model reviews) {
        reviews.addAttribute("reviews", reviewRepository.findAll());

        return "game/reviews";
    }

}
