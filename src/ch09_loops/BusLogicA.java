package ch09_loops;

class BusLogicA {

    private int firstnum,  secondnum,  sum;

    public BusLogicA() {
    }

    // public constructor with two arguments
    public BusLogicA(int n, int m) {
        firstnum = n;
        secondnum = m;
    }

    // public method to calculate the sum
    public int calc() {
        sum = firstnum + secondnum;
        return sum;
    }
}
