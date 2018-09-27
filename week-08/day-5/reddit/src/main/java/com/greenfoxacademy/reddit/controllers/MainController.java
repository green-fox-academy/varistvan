package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private PostRepository postRepository;
    private PostService postService;

    public MainController(PostRepository postRepository, PostService postService) {
        this.postRepository = postRepository;
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }

    @GetMapping("/submit")
    public String submitForm() {
        return "submit";
    }

    @PostMapping("/submit")
    public String submitSubmit(String title, String url) {
        Post newpost = new Post(title, url);
        postRepository.save(newpost);
        return "redirect:/";
    }

    @GetMapping("/upvote/{id}")
    public String upvote(@PathVariable long id) {
        postService.upvote(id);
        return "redirect:/";
    }

    @GetMapping("/downvote/{id}")
    public String downvote(@PathVariable long id) {
        postService.downvote(id);
        return "redirect:/";
    }

}
