package ch09_loops;

import javax.swing.JOptionPane;

class StarBurst {

    public static void main(String[] args) {
        String numberStr =
                JOptionPane.showInputDialog("how many?");
        int n = Integer.parseInt(numberStr);
        int counter = 0;
        while (counter < n) {
            if (n == 13) {
                break;
            }
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }
}
