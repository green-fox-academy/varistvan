package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

//@Service
public class BlueColor implements MyColor {

    private Printer printer;

    BlueColor (Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is blue in color...");
    }
}
