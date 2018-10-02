package com.greenfoxacademy.frontend.controllers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoublingControllerTest {
    private DoublingController controller;

    @Before
    public void before() {
        controller = new DoublingController();
    }

    @Test
    public void doubling() {
        DoublingController.Doubler result = controller.doubling(2);
        assertEquals(4, result.result);
    }
    @Test
    public void doublingBig() {
        DoublingController.Doubler result = controller.doubling(-444);
        assertEquals(-888, result.result);
    }
}