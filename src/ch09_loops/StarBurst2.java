package ch09_loops;

import javax.swing.JOptionPane;

class StarBurst2 {

    public static void main(String[] args) {
        String numberStr =
                JOptionPane.showInputDialog("how many?");
        int n = Integer.parseInt(numberStr);
        int counter = 0;
        while (counter < n) {

            System.out.print("*");
            counter++;
            if (n == 13) {
                break;
            }
        }
        System.out.println();
    }
}
