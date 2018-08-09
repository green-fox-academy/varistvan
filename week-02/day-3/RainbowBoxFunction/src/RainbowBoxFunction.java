import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int a = 20;
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        list.add("magenta");
        System.out.println(list);
        squareDrawer(graphics, a/*, list.get(0)*/);
    }
    
    public static void squareDrawer(Graphics graphics, int a/*, String[] colName*/) {
        int theLimit;
        if (HEIGHT > WIDTH) {
            theLimit = WIDTH / 2;
        }else {
            theLimit = HEIGHT / 2;
        }
        for (int i = 0; i < theLimit ; i++) {
//            graphics.setColor(colList.get(1+i));
            graphics.drawRect(i, i,WIDTH - 2 * i,10);
        }
    }
        

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}