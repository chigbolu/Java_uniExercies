package ch09_loops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUIA2 extends JFrame
        implements ActionListener {

    JLabel numOneLabel = new JLabel("Enter your first number:  ");
    JTextField numOneTxt = new JTextField(3);
    JLabel numTwoLabel = new JLabel("Enter your second number:  ");
    JTextField numTwoTxt = new JTextField(3);
    JTextArea commentTxt = new JTextArea(2, 20);
    JButton sumBtn = new JButton("ADD");

    public static void main(String[] args) {
        GUIA2 jf = new GUIA2();
    }

    public GUIA2() {
        setLayout(new FlowLayout());
        setSize(600, 200);
        setTitle("Adding");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(numOneLabel);
        add(numOneTxt);
        add(numTwoLabel);
        add(numTwoTxt);
        add(sumBtn);
        add(commentTxt);
        sumBtn.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String numOne = numOneTxt.getText();
        String numTwo = numTwoTxt.getText();
        BusLogicA2 ba = new BusLogicA2(numOne, numTwo);
        String ans = ba.calc();
        String message = "The sum of your two numbers is \n " + ans;
        commentTxt.setText(message);
    }
}
