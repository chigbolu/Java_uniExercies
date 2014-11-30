package ch09_loops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Police extends JFrame
        implements ActionListener {

    JButton cop = new JButton("POLICE");
    JTextField arrest = new JTextField(15);

    public static void main(String[] args) {
        Police jf = new Police();
        jf.setVisible(true);
    }

    public Police() {
        setLayout(new FlowLayout());
        setSize(200, 100);
        setTitle("Police!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(cop);
        add(arrest);
        cop.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        int counter = 0;
        String enquiry = "";
        while (counter < 4) {
            enquiry += "ello!  ";
            counter++;
        }
        arrest.setText(enquiry);
    }
}
