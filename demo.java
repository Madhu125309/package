abstract class abs {
  public abstract void getData();

  public void setData() {
    System.out.println("hi");
  }
}

class dao extends abs {
  public void getData() {
    System.out.println("hello");
  }
}

public class demo {
  public static void main(String[] args) {
    dao a = new dao();
    a.getData();
    a.setData();
  }
}
