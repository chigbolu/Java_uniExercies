package ch09_loops;

import javax.swing.JOptionPane;

class Stars {

    public static void main(String[] args) {
        String numberStr =
                JOptionPane.showInputDialog("how many?");
        int n = Integer.parseInt(numberStr);
        int counter = 0;
        while (counter < n) {
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }
}
