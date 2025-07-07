@FunctionalInterface
interface A {
  void show();
}

/*
class B implements A {
  public void show() {
    System.out.println("in class B - show");
  }
}
 */

public class Interface2 {
  public static void main(String a[]) {
    // A obj = new B();
    A obj = new A() {
      public void show() {
        System.out.println("in A - show");
      }
    };

    A obj1 = () -> System.out.println("in A lambda - show");

    obj.show();
    obj1.show();
  }
}
