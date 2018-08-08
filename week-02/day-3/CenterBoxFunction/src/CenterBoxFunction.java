import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

//        Draws the diagonals to control the center.
//        graphics.drawLine(0,0,WIDTH,HEIGHT);
//        graphics.drawLine(WIDTH, 0,0,HEIGHT);
        int a = 80;
        squaresToCenter(graphics, a);
    }

    public static void squaresToCenter(Graphics graphics, int forSize) {
        for (int i = 0; i < 3; i++) {
            graphics.drawRect((WIDTH / 2 - forSize / 2) + i * 4, (HEIGHT / 2 - forSize / 2) + i * 4, forSize - i * 8, forSize - i * 8);
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