package com.group7ooec.gamevendor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.group7ooec.gamevendor.security.UserDetailsServiceImpl;
import com.group7ooec.gamevendor.security.UserRepository;

import java.util.Random;

import com.group7ooec.gamevendor.model.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class SignupController {

    @Autowired
    private UserDetailsServiceImpl userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping(value="/process_signup")
    public String processSignup(User user){
        if (userRepository.getUserByUsername(user.getUsername()) != null){
            System.out.println("ok");
            return("signup");
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setUsername(user.getUsername());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return "login";
    }
    

}
