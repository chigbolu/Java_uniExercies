package ch09_loops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUIA extends JFrame
        implements ActionListener {

    JLabel numOneLabel = new JLabel("Enter your first number:  ");
    JTextField numOneTxt = new JTextField(3);
    JLabel numTwoLabel = new JLabel("Enter your second number:  ");
    JTextField numTwoTxt = new JTextField(3);
    JTextArea commentTxt = new JTextArea(2, 20);
    JButton sumBtn = new JButton("ADD");

    public static void main(String[] args) {
        GUIA jf = new GUIA();
    }

    public GUIA() {
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
        int numOne = Integer.parseInt(numOneTxt.getText());
        int numTwo = Integer.parseInt(numTwoTxt.getText());
        BusLogicA ba = new BusLogicA(numOne, numTwo);
        int ans = ba.calc();
        String ansTxt = Integer.toString(ans);
        String message = "The sum of your two numbers is \n " + ansTxt;
        commentTxt.setText(message);
    }
}
