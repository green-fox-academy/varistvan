package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class MainControllerTest {

    private PostService mockPostService;

    @Before
    public void before() {
        mockPostService = mock(PostService.class);
    }

    @Test
    public void index() {
        MainController controller = new MainController(mockPostService);
        String result = controller.index(new BindingAwareModelMap());
        assertEquals("index", result);
    }

    @Test
    public void submitForm() {
        MainController controller = new MainController(mockPostService);
        String result = controller.submitForm();
        assertEquals("submit", result);
    }

    @Test
    public void submitSubmit() {
        MainController controller = new MainController(mockPostService);
        String result = controller.submitSubmit("Title", "Url");
        assertEquals("redirect:/", result);
    }

    @Test
    public void upvote() {
        MainController controller = new MainController(mockPostService);
        String result = controller.upvote(1);
        assertEquals("redirect:/", result);
    }

    @Test
    public void downvote() {
        MainController controller = new MainController(mockPostService);
        String result = controller.downvote(1);
        assertEquals("redirect:/", result);
    }
}