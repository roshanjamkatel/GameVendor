package com.group7ooec.gamevendor.controller;

import com.group7ooec.gamevendor.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("/genres")
    public String showAll(Model model){
        model.addAttribute("genres", genreRepository.findAll());

        return "genres/list";
    }
}
