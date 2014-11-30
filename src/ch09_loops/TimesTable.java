package ch09_loops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class TimesTable extends JFrame implements ActionListener, ChangeListener {

    private MyCanvas canvas = new MyCanvas();
    private JSlider sizeSl = new JSlider(1, 12, 1);
    private JButton reset = new JButton("RESET");
    private int size = 0;

    public static void main(String[] args) {
        new TimesTable();
    }

    public TimesTable() {
        setLayout(new BorderLayout());
        setSize(600, 352);
        setTitle("Times Table");
        sizeSl.setMajorTickSpacing(1);
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
            //frame for across the top of table

            for (int j = 1; j < size + 1; j++) {
                x = 20 + 30 * j;
                y = 20;
                g.drawString(Integer.toString(j), x, y);
            }
            //frame for down the side of table

            for (int i = 1; i < size + 1; i++) {
                x = 20;
                y = 30 + 10 * i;
                g.drawString(Integer.toString(i), x, y);
            }

            //the table itself
            for (int i = 1; i < size + 1; i++) {
                for (int j = 1; j < size + 1; j++) {
                    x = 20 + 30 * j;
                    y = 30 + 10 * i;
                    g.drawString(Integer.toString(j * i), x, y);
                }
            }
        }
    }
}
