package com.greenfoxacademy.frontend.controllers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppendAControllerTest {
    private AppendAController controller;

    @Before
    public void before() {
        controller = new AppendAController();
    }

    @Test
    public void appendAChinchilla() {
        AppendAController.Appendable result = controller.appendA("chinchill");
        assertEquals("chinchilla", result.appended);
    }

    @Test
    public void appendAAlma() {
        AppendAController.Appendable result = controller.appendA("alm");
        assertEquals("alma", result.appended);
    }
}