class parent {

    public void m1() {
        System.out.println("parent class-m1(10)");
    }
}

class child extends parent { // inheritance
    public void m2() {
        System.out.println("child class-m2(20)");
    }
}

class test {
    public static void main(String[] args) {
        child b = new child();
        b.m1();
        b.m2();

    }
}
