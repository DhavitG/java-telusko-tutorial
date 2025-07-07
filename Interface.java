interface Computer{
  int age = 21; // by default public static final (variables)
  void code(); // by default public abstract
}

class Laptop implements Computer {
  // you dont get to change the variable values here
  public void code() {
    System.out.println(age);
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
    dhavit.devApp(macbook);
  }
}
