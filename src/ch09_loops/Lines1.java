package ch09_loops;

import java.awt.*;
import javax.swing.*;

public class Lines1 extends JFrame {

    private MyCanvas canvas = new MyCanvas();

    public static void main(String[] args) {
        new Lines1();
    }

    public Lines1() {
        setLayout(new BorderLayout());
        setSize(248, 275); // canvas is 240 X 240
        setTitle("Lines 1");
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
            while (n < 5) {
                g.drawLine(x, y, x + 100, y);
                y += 10;
                n++;
            }
        }
    }
}
