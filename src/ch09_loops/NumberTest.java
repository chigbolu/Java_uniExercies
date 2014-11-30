package ch09_loops;

import javax.swing.JOptionPane;

class NumberTest {

    public static void main(String[] args) {
        String numberStr =
                JOptionPane.showInputDialog("think of a number");
        int n = Integer.parseInt(numberStr);
        while (n > 1) {
            System.out.print(n + ", ");
            if (n % 2 == 0) {
                n /= 2; // divide by 2
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
    }
}
