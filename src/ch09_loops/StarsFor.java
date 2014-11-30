package ch09_loops;

import javax.swing.JOptionPane;

class StarsFor {

    public static void main(String[] args) {
        String numberStr =
                JOptionPane.showInputDialog("how many?");
        int n = Integer.parseInt(numberStr);
        for (int counter = 0; counter < n; counter++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
