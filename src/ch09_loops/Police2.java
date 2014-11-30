package ch09_loops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Police2 extends JFrame
        implements ActionListener {

    JButton cop = new JButton("POLICE");
    JTextField arrest = new JTextField(15);

    public static void main(String[] args) {
        Police2 jf = new Police2();
        jf.setVisible(true);
    }

    public Police2() {
        setLayout(new FlowLayout());
        setSize(200, 100);
        setTitle("Police Again!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(cop);
        add(arrest);
        cop.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        String enquiry = "";
        for (int counter = 0; counter < 2; counter++) {
            enquiry += "ello!  ";
        }
        arrest.setText(enquiry);
    }
}
