package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

public interface PostService {

    Iterable<Post> findAll();

    void submitPost(String title, String url);

    void upvote(long id);

    void downvote(long id);
}
