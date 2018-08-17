import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CrossLines {
    static int nrOfRecursions;

    public static void mainDraw(Graphics g) {
        nrOfRecursions = 4;
        drawCrossLines(g, 300, 300, 600, 0);
    }

    public static void drawCrossLines(Graphics g, int x0, int y0, int side, int recNr) {
        if (recNr > nrOfRecursions) {
            return;
        }
        g.drawLine(x0-side/6, y0-side/2, x0-side/6, y0+side/2);
        g.drawLine(x0+side/6, y0-side/2, x0+side/6, y0+side/2);
        g.drawLine(x0-side/2, y0-side/6, x0+side/2, y0-side/6);
        g.drawLine(x0-side/2, y0+side/6, x0+side/2, y0+side/6);

        drawCrossLines(g, x0, y0-side/3, side/3, recNr + 1);
        drawCrossLines(g, x0, y0 - side, side/3, recNr + 1);
        drawCrossLines(g, x0 + side/3, y0 - side, side/3, recNr + 1);
        drawCrossLines(g, x0 - side, y0, side/3, recNr + 1);
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
