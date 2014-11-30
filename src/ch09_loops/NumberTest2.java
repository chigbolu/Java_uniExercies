package ch09_loops;

import javax.swing.JOptionPane;

class NumberTest2 {

    public static void main(String[] args) {
        String numberStr =
                JOptionPane.showInputDialog("think of a number");
        long n = Integer.parseInt(numberStr);
        while (n > 1) {
            System.out.print(n + ", ");
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
    }
}
