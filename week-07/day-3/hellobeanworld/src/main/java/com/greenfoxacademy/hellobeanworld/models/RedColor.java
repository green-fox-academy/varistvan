package com.greenfoxacademy.hellobeanworld.models;

//@Service
public class RedColor implements MyColor {

    private Printer printer;

    RedColor (Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is red in color...");
    }
}
