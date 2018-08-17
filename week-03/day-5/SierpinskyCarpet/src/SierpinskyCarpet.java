import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    static int nrOfRecursions;

    public static void mainDraw(Graphics graphics) {
        nrOfRecursions = 4;
        drawSquare(graphics, 300, 300, 200, 0);
    }

    public static void drawSquare(Graphics g, int x0, int y0, int side, int depth) {
        if (depth > nrOfRecursions) {
            return;
        }
        g.fillRect(x0-side/2, y0-side/2, side, side);

        drawSquare(g, x0 - side, y0 -side, side/3, depth + 1);
        drawSquare(g, x0, y0 - side, side/3, depth + 1);
        drawSquare(g, x0 + side, y0 - side, side/3, depth + 1);
        drawSquare(g, x0 - side, y0, side/3, depth + 1);
        drawSquare(g, x0 + side, y0, side/3, depth + 1);
        drawSquare(g, x0 - side, y0 + side, side/3, depth + 1);
        drawSquare(g, x0, y0 + side, side/3, depth + 1);
        drawSquare(g, x0 + side, y0 + side, side/3, depth + 1);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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
