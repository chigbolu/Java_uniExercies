package ch09_loops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUIB extends JFrame
        implements ActionListener {

    JLabel numOneLabel = new JLabel("Enter your first number:  ");
    JTextField numOneTxt = new JTextField(3);
    JLabel numTwoLabel = new JLabel("Enter your second number:  ");
    JTextField numTwoTxt = new JTextField(3);
    JTextArea commentTxt = new JTextArea(2, 20);
    JButton sumBtn = new JButton("ADD");
    JButton multBtn = new JButton("MULTIPLY");

    public static void main(String[] args) {
        GUIB jf = new GUIB();
    }

    public GUIB() {
        setLayout(new FlowLayout());
        setSize(600, 200);
        setTitle("Add or Muliply?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(numOneLabel);
        add(numOneTxt);
        add(numTwoLabel);
        add(numTwoTxt);
        add(sumBtn);
        add(multBtn);
        add(commentTxt);
        sumBtn.addActionListener(this);
        multBtn.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String numOne = numOneTxt.getText();
        String numTwo = numTwoTxt.getText();
        String operation = "";
        if (e.getSource() == sumBtn) {
            operation = "sum";
        }
        if (e.getSource() == multBtn) {
            operation = "product";
        }

        BusLogicB bb = new BusLogicB(numOne, numTwo, operation);
        String numTxt = bb.calc();
        String message = "The " + operation + " of your two numbers is \n " + numTxt;
        commentTxt.setText(message);
    }
}
