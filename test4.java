class account {
    int bal = 100;
    public double deposit_amount = 2000;

    account() {
        System.out.println("acc.class.const");
    }

    public int bal() {
        return this.bal;
    }

    public double deposit_amount(double amount) {
        return this.deposit_amount;
    }
}

public class test4 {
    public static void main(String[] args) {
        account a = new account();
        System.out.println(a.bal);
        System.out.println(a.deposit_amount);
    }
}
