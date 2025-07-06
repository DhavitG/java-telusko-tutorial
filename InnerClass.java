class A {
  public void show() {
    System.out.println("Showing A");
  }
}

public class InnerClass {
  public static void main(String a[]) {
    A obj = new A()
      {
        public void show() {
          System.out.println("In new show");
        }
      };
    obj.show();
  }
}
