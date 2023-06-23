class account {
    private double min_bal;

    public double get_min_bal() {
        return this.min_bal;
    }

    public void set_min_bal(double bal) { // encription
        this.min_bal = bal;
    }
}

public class test1 {
    public static void main(String[] args) {
        account b = new account();
        b.set_min_bal(100.00);
        System.out.println(b.get_min_bal());
    }
}
