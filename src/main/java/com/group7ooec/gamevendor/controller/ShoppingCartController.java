package com.group7ooec.gamevendor.controller;


import com.group7ooec.gamevendor.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;




@Controller
public class ShoppingCartController {
    
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @GetMapping("/shoppingCart")
    public String showAll(Model model){
        model.addAttribute("shoppingCart", shoppingCartRepository.findAll());

        return "shoppingCart";
    }
}
