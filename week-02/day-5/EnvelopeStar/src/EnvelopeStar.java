import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int s = WIDTH / 2;      // "s" is half of the side of the square shaped screen
        if (HEIGHT < WIDTH) {
            s = HEIGHT / 2;
        }
        graphics.setColor(Color.green);
        for (int i = 10; i < (2 * s); i += 10) {
            if (i <= s){
                graphics.drawLine(i, s, s, s - i);
                graphics.drawLine(i, s, s, s + i);
            }else{
                graphics.drawLine(i, s, s,i - s);
                graphics.drawLine(i, s, s,3 * s - i);
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