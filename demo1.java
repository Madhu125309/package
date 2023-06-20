interface a {
    public abstract void getdata();

    public abstract void setdata();

    public abstract void getemployee();
}

class b implements a {
    public void getdata() {
        System.out.println("good");
    }

    public void setdata() {
        System.out.println("bad"); // class to interface
    }

    public void getemployee() {
        System.out.println("luck");
    }
}

class demo1 {
    public static void main(String[] args) {
        b b1 = new b();
        b1.getdata();
        b1.setdata();
        b1.getemployee();
    }
}
