package ch09_loops;

import javax.swing.JOptionPane;

class SquareStars {

    public static void main(String[] args) {
        String numberStr =
                JOptionPane.showInputDialog("how many?");
        int n = Integer.parseInt(numberStr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}