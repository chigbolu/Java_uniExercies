package ch09_loops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Bouncer extends JFrame implements ActionListener {

    private int x = 7,  xChange = 7;
    private int y = 2,  yChange = 2;
    private int diameter = 10;
    private MyCanvas canvas = new MyCanvas();

    public static void main(String[] args) {
        new Bouncer();
    }

    public Bouncer() {
        setLayout(new BorderLayout());
        setSize(400, 300);
        setTitle("Bouncing ball");
        add("Center", canvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // add your event handling code here
    }

    private class MyCanvas extends Canvas {

        @Override
        public void paint(Graphics g) {
            int leftX = 0, topY = 0;
            int rightX = getWidth() - 10, bottomY = getHeight() - 10;
            int bounces = 0;
            while (bounces < 20) {
                wasteTime();
                Color backgroundColour = getBackground();
                g.setColor(backgroundColour);
                g.fillOval(x, y, diameter, diameter);
                if (x <= leftX) {
                    xChange = -xChange;
                    bounces++;
                }
                if (x >= rightX) {
                    xChange = -xChange;
                    bounces++;
                }
                if (y <= topY) {
                    yChange = -yChange;
                    bounces++;
                }
                if (y >= bottomY) {
                    yChange = -yChange;
                    bounces++;
                }
                x += xChange;
                y += yChange;
                g.setColor(Color.red);
                g.fillOval(x, y, diameter, diameter);
            }
        }

        private void wasteTime() {
            for (int i = 1; i < 10000000; i++);
        }
    }
}