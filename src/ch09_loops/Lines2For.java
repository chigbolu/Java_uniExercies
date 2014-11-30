package ch09_loops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Lines2For extends JFrame implements ActionListener, ChangeListener {

    private MyCanvas canvas = new MyCanvas();
    private JSlider nLinesSl = new JSlider(0, 20, 0);
    private JButton reset = new JButton("RESET");
    private int nLines = 0; // number of lines to draw

    public static void main(String[] args) {
        new Lines2For();
    }

    public Lines2For() {
        setLayout(new BorderLayout());
        setSize(250, 352);
        setTitle("Lines 2 (for loop)");
        nLinesSl.setMajorTickSpacing(5);
        nLinesSl.setMinorTickSpacing(1);
        nLinesSl.setPaintTicks(true);
        nLinesSl.setPaintLabels(true);
        add("North", nLinesSl);
        nLinesSl.addChangeListener(this);
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
        nLines = 0;
        nLinesSl.setValue(0);
        canvas.repaint();
    }

    public void stateChanged(ChangeEvent e) {
        nLines = nLinesSl.getValue();
        canvas.repaint();
    }

    private class MyCanvas extends Canvas {

        @Override
        public void paint(Graphics g) {
            int x = 20;
            int y = 20;
            for (int n = 0; n < nLines; n++) {
                g.drawLine(x, y, x + nLines * 10, y);
                y += 10;
            }
        }
    }
}
