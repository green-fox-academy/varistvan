import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int boxXY[][] = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] dotsXY = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        connectDots(graphics, boxXY);
        connectDots(graphics, dotsXY);
    }

    public static void connectDots(Graphics graphics, int[][] coordList) {
        for (int i = 0; i < coordList.length; i++) {
            graphics.setColor(Color.green);
            if (i == coordList.length - 1){
                graphics.drawLine(coordList[i][0], coordList[i][1], coordList[0][0], coordList[0][1]);
            }else{
                graphics.drawLine(coordList[i][0], coordList[i][1], coordList[i + 1][0], coordList[i + 1][1]);
            }
        }
    }

    // Don't touch the code below
    static final int WIDTH = 320;
    static final int HEIGHT = 343;

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


// create a 300x300 canvas.