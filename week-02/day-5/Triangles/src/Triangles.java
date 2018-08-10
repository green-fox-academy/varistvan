import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int size = 10;
        drawATriangle(graphics, size);
    }

    public static void drawATriangle(Graphics graphics, int a) {
        int s = WIDTH / 2;
        int h = (int) (a * Math.sin(Math.toRadians(60)));
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < i + 1; j++) {
                int x1 = s + (a / 2) * i;
                int y1 = i * h;                 // ready
                int x2 = s + a/2 * (i + 1);
                int y2 = (i + 1) * h;           // ready
                int x3 = s - a/2 * (i + 1);
                int y3 = (i + 1) * h;           // ready
                graphics.drawLine(x1, y1, x2, y2);
                graphics.drawLine(x2, y2, x3, y3);
                graphics.drawLine(x3, y3, x1, y1);
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