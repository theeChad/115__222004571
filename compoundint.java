class Cloan {
    double principal;
    double rate;
    int time;

    public Cloan(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculatetotalamount() {
        double compoundinterest = principal * (Math.pow(1 + (rate / 100), time) - 1);
        double totalamount = principal + compoundinterest;
        return totalamount;
    }
}

public class compoundint {
    public static void main(String[] args) {
        double principal = 500000; 
        double rate = 18;
        int time = 3; 

        Cloan bobLoan = new Cloan(principal, rate/12, time*12);

        double amountpaid = bobLoan.calculatetotalamount();

        System.out.println("Total amount paid by Mr Bob is: " + amountpaid + " Rwf");
    }
}





