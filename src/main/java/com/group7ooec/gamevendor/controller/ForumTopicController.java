package com.group7ooec.gamevendor.controller;

import com.group7ooec.gamevendor.model.ForumTopic;
import com.group7ooec.gamevendor.repository.ForumPostRepository;
import com.group7ooec.gamevendor.repository.ForumTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ForumTopicController {

    @Autowired
    private ForumTopicRepository forumTopicRepository;

    @Autowired
    private ForumPostRepository forumPostRepository;


    @GetMapping("/forum/topics")
    public String showAll(Model model){
        model.addAttribute("topics", forumTopicRepository.findAll());

        return "forum/topics";
    }

    @GetMapping("/forum/topic/{id}")
    public String getByTopic(Model model, @PathVariable String id){
        model.addAttribute("posts", forumPostRepository.findByTopicId(id));
        return "forum/posts";
    }

    @GetMapping("/forum/posts/{id}")
    public String getPostById(Model model, @PathVariable String id){
        model.addAttribute("posts", forumPostRepository.findAll());
        model.addAttribute("id", id);
        return "forum/post";
    }

}
