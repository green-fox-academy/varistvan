import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int density = 20;  // distance between the lines
        int side;
        if (HEIGHT < WIDTH) {
            side = HEIGHT;
        }else{
            side = WIDTH;
        }
        graphics.setColor(Color.magenta);
        for (int i = 0; i < side-density; i+=density) {
            graphics.drawLine(density+i,0,side,i+density);
        }
        graphics.setColor(Color.green);
        for (int i = 0; i < side-density; i+=density) {
            graphics.drawLine(0,density+i,i+density,side);
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