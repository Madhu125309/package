interface abs {
    public abstract void display();

    static int amount = 100;
}

class demo implements abs {
    public void display() {
        System.out.println("hi");
    }

}

class demo3 {
    public static void main(String[] args) {
        demo a = new demo();
        a.display();
        System.out.println(abs.amount);
        System.out.println(a.amount);
        System.out.println(a);

    }
}
