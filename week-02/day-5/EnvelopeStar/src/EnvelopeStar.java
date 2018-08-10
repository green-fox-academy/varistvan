import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int side;
        if (HEIGHT < WIDTH) {
            side = HEIGHT;
        }else{
            side = WIDTH;
        }
        graphics.setColor(Color.green);
        for (int i = 10; i < side; i += 10) {
            if (i <= side / 2){
                graphics.drawLine(i, side/2, side/2, side/2 - i);
            }else{
                graphics.drawLine(i,side/2, side/2,side/2 + i-(side));
            }
            if (i <= side / 2){
                graphics.drawLine(i, side/2, side/2, side/2 + i);
            }else{
                graphics.drawLine(i,side/2, side/2,side-i+(side/2));
            }
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