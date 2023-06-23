class account {
    int acc_bal = 100;

    public void open_acc() {

    }

    public void deposit_amount(int amount) {
        this.acc_bal = this.acc_bal + amount;
    }

    public int acc_bal() {
        return this.acc_bal; // inheritance
    }
}

public class test3 {
    public static void main(String[] args) {
        account a1 = new account();
        a1.open_acc();
        a1.deposit_amount(100);
        a1.deposit_amount(4000);
        System.out.println(a1.acc_bal);

    }
}
