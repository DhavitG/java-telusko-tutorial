interface Computer{
  void code();
}

class Laptop implements Computer {
  public void code() {
    System.out.println("code, compile, run");
  }
}

class Desktop implements Computer {
  public void code() {
    System.out.println("code, compile, run: Faster");
  }
}

class Developer {
  public void devApp(Computer lap) {
    lap.code();
  }
}

public class Interface {
  public static void main(String a[]) {
    Computer macbook = new Laptop();
    Computer iMac = new Desktop();

    Developer dhavit = new Developer();
    dhavit.devApp(iMac);
  }
}
