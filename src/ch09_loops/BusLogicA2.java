package ch09_loops;

class BusLogicA2 {

    private int firstnum,  secondnum,  sum;

    public BusLogicA2() {
    }

    // public constructor with two arguments
    public BusLogicA2(String n, String m) {
        firstnum = Integer.parseInt(n);
        secondnum = Integer.parseInt(m);
    }

    // public method to calculate the sum
    public String calc() {
        sum = firstnum + secondnum;
        String sumTxt = Integer.toString(sum);
        return sumTxt;
    }
}
