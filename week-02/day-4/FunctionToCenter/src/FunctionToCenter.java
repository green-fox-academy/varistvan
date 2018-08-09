import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    private static int smallerDimension;
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        if(WIDTH < HEIGHT){
            smallerDimension = WIDTH;
        }else{
            smallerDimension = HEIGHT;
        }
        graphics.setColor(Color.green);
        graphics.drawLine(0,0,smallerDimension,smallerDimension);
        graphics.drawLine(0,smallerDimension,smallerDimension,0);
        graphics.setColor(Color.black);
        for (int i = 0; i <= smallerDimension; i += 20) {
            toTheCenter(graphics, i, 0);
            toTheCenter(graphics, 0, i);
            toTheCenter(graphics, i, smallerDimension);
            toTheCenter(graphics, smallerDimension, i);
        }
    }

    public static void toTheCenter(Graphics graphics, int xForX, int yForY) {
        graphics.drawLine(xForX, yForY, smallerDimension / 2, smallerDimension / 2);
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