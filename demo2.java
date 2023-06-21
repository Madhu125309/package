interface demo {
    public abstract void getdata();

    public abstract void getemployee();

    public abstract void setdata();
}

interface demo3 {

    public abstract void setemployee();

    public abstract void setmap();

    public abstract void getmap();
}

class dem implements demo3 {
    public void setemployee() {
        System.out.println("hello"); // inetrface to interface
    }

    public void setmap() {
        System.out.println("hai");
    }

    public void getmap() {
        System.out.println("friend");
    }
}

public class demo2 {
    public static void main(String[] args) {
        dem a = new dem();
        a.setemployee();
        a.setmap();
        a.getmap();
    }
}