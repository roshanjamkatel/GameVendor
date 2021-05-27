package com.group7ooec.gamevendor.controller;

import com.group7ooec.gamevendor.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping("/posts")
    public String showAll(Model model){
        model.addAttribute("posts", blogPostRepository.findAll());

        return "posts/list";
    }
    // double check
    @GetMapping("/posts/detailedView")
    public String showGameDetails(Model model) {
        model.addAttribute("posts", blogPostRepository.findAll());
        return "posts/detailedView";
    }

}
