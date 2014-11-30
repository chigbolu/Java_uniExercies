package ch09_loops;

class BusLogicB {

    private int firstnum,  secondnum,  ans;
    private String operator;

    public BusLogicB() {
    }

    // public constructor with two arguments
    public BusLogicB(String n, String m, String o) {
        firstnum = Integer.parseInt(n);
        secondnum = Integer.parseInt(m);
        operator = o;
    }

    // public method to calculate the sum
    public String calc() {

        if (operator.equals("sum")) {
            ans = firstnum + secondnum;
        }
        if (operator.equals("product")) {
            ans = firstnum * secondnum;
        }

        String ansTxt = Integer.toString(ans);
        return ansTxt;
    }
}
