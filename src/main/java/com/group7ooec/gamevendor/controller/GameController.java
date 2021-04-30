package com.group7ooec.gamevendor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GameController {

    @GetMapping("/")
    public String helloGame() {
        return "home";
    }
}
