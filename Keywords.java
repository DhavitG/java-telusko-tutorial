class A {
  public A() {
    this(4);
    System.out.println("in A");
  }

  public A(int a) {
    System.out.println("int in A");
  }
}

final class B extends A { // B cannot be inherited
  public B() {
    // super(); first statement of every constructor is super (even if u dont mention)
    super();
    System.out.println("in B");
  }

  public B(int n) {
    this();
    System.out.println("int in B");
  }
}

// final method: stops method overriding

public class Keywords {
  public static void main(String a[]) {
    B obj = new B(5); // calls constructor of B and constructor of super class
    final int num = 9;
  }
}

// new B(5) => calls "int in B" => calls "in B" => calls "in A" => calls "int in A"