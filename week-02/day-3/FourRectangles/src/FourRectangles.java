import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x, y;
        x = y = 10;
        for (int i = 0; i < 4; i++) {
            int forR = (int)(Math.random()*256);
            int forG = (int)(Math.random()*256);
            int forB = (int)(Math.random()*256);
            Color color = new Color(forR, forG, forB);
            graphics.setColor(color);
            graphics.fillRect((int)(Math.random() * (WIDTH / 2)), (int)(Math.random() * (HEIGHT / 2)), (int)(Math.random()*(WIDTH / 2)), (int)(Math.random()*(HEIGHT / 2)));
        }
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}