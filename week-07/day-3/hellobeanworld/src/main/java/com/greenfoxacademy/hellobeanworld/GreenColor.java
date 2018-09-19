package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {

    private Printer printer;

    GreenColor (Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is green in color...");
    }
}
