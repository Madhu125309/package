class A {
    int a;
    int b;

    public int add(int a, int b) {
        return a + b;
    }

}

class B extends A {
    public void mul() {

        System.out.println("madhu");

    }
}

class C extends B {
    public int div(int a, int b) {
        return a / b;

    }

}

public class test2 {
    public static void main(String[] args) {

        C c = new C();
        c.mul();
        System.out.println(c.add(10, 20));
        System.out.println(c.div(40, 10));
    }
}
