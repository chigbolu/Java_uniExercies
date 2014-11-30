package ch09_loops;

import java.awt.*;
import javax.swing.*;

public class Steps extends JFrame {

    private MyCanvas canvas = new MyCanvas();

    public static void main(String[] args) {
        new Steps();
    }

    public Steps() {
        setLayout(new BorderLayout());
        setSize(248, 275); // canvas is 240 X 240
        setTitle("Steps");
        add("Center", canvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class MyCanvas extends Canvas {

        @Override
        public void paint(Graphics g) {
            int n = 0;
            int x = 20;
            int y = 20;
            while (n < 8) {
                g.drawLine(x, y, x + 20, y);
                g.drawLine(x + 20, y, x + 20, y + 10);
                x += 10;
                y += 10;
                n++;
            }
        }
    }
}
