package ch09_loops;

import java.awt.*;
import javax.swing.*;

public class Lines1For extends JFrame {

    private MyCanvas canvas = new MyCanvas();

    public static void main(String[] args) {
        new Lines1For();
    }

    public Lines1For() {
        setLayout(new BorderLayout());
        setSize(248, 275); // canvas is 240 X 240
        setTitle("Lines 1 (for loop)");
        add("Center", canvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class MyCanvas extends Canvas {

        @Override
        public void paint(Graphics g) {
            int x = 20;
            int y = 20;
            for (int n = 0; n < 5; n++) {
                g.drawLine(x, y, x + 100, y);
                y += 10;
            }
        }

        /* alternative paint method
        public void paint(Graphics g)
        {
        int x = 20, y, n;
        for (n = 0, y = 20; n < 5; n++, y += 10)
        {
        g.drawLine(x, y, x + 100, y);
        }
        }
         */
    }
}
