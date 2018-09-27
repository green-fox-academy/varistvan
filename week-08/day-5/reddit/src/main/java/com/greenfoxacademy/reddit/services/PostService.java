package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void upvote(long id) {
        Post post = postRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        post.setRating(post.getRating() + 1);
        postRepository.save(post);
    }

    public void downvote(long id) {
        Post post = postRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        post.setRating(post.getRating() - 1);
        postRepository.save(post);
    }

}
