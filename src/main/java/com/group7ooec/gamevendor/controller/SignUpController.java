package com.group7ooec.gamevendor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.group7ooec.gamevendor.security.UserDetailsServiceImpl;
import com.group7ooec.gamevendor.model.User;
import org.springframework.ui.Model;

@Controller
public class SignupController {

    @Autowired
    private UserDetailsServiceImpl userService;

    @GetMapping("/signup")
    public String signup(Model model) {
        User userDto = new User();
        model.addAttribute("user", userDto);
        return "signup";
    }

}
