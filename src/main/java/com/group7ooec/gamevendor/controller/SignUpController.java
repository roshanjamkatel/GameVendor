//package com.group7ooec.gamevendor.controller;
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
//
//import com.group7ooec.gamevendor.model.User;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.Errors;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.ModelAndView;
//
//public class SignUpController {
//
//    private UserService
//
//    @GetMapping("/signup")
//    public String signup(WebRequest request, Model model) {
//        User userDTO = new User();
//        model.addAttribute("users",userDTO);
//        return "signup";
//    }
//
//    @PostMapping("/user/registration")
//    public ModelAndView registerUserAccount(@ModelAttribute("user") @Valid User userDto, HttpServletRequest request,
//            Errors errors) {
//
//        try {
//            User registered = userService.registerNewUserAccount(userDto);
//        } catch (UserAlreadyExistException uaeEx) {
//            mav.addObject("message", "An account for that username/email already exists.");
//            return mav;
//        }
//
//        return new ModelAndView("successRegister", "user", userDto);
//    }
//}
//
