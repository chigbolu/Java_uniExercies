package ch09_loops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Blobs3 extends JFrame implements ActionListener, ChangeListener {

    private MyCanvas canvas = new MyCanvas();
    private JSlider sizeSl = new JSlider(0, 20, 0);
    private JButton reset = new JButton("RESET");
    private int size = 0; // number of lines to draw

    public static void main(String[] args) {
        new Blobs3();
    }

    public Blobs3() {
        setLayout(new BorderLayout());
        setSize(254, 352);
        setTitle("Blobs (nested for)");
        sizeSl.setMajorTickSpacing(5);
        sizeSl.setMinorTickSpacing(1);
        sizeSl.setPaintTicks(true);
        sizeSl.setPaintLabels(true);
        add("North", sizeSl);
        sizeSl.addChangeListener(this);
        add("Center", canvas);
        JPanel bottom = new JPanel();
        bottom.add(reset);
        reset.addActionListener(this);
        add("South", bottom);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        size = 0;
        sizeSl.setValue(0);
        canvas.repaint();
    }

    public void stateChanged(ChangeEvent e) {
        size = sizeSl.getValue();
        canvas.repaint();
    }

    private class MyCanvas extends Canvas {

        @Override
        public void paint(Graphics g) {
            int x, y;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    x = 20 + 10 * i;
                    y = 20 + 30 * j;
                    g.fillOval(x, y, 10, 10);
                }
            }
        }
    }
}
