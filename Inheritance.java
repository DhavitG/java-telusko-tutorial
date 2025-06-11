class Calc {
  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int subtract(int n1, int n2) {
    return n1 - n2;
  }
} 

class AdvCalc extends Calc {
  public int multi(int n1, int n2) {
    return n1 * n2;
  }

  public int div(int n1, int n2) {
    return n1 / n2;
  }

  public void show() {
    System.out.println("in advCalc show");
  }
}

class VeryAdvCalc extends AdvCalc{
  public double power(int n1, int n2) {
    return Math.pow(n1, n2);
  }

  public void show() {
    System.out.println("in veryAdvCalc show");
  }
}

public class Inheritance {
  public static void main(String a[]) {
    VeryAdvCalc obj = new VeryAdvCalc();
    int r1 = obj.add(2, 1);
    int r2 = obj.subtract(1, 2);
    int r3 = obj.multi(5, 3);
    int r4 = obj.div(15, 5);
    double r5 = obj.power(4, 2);

    obj.show();

    System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);
     
  }
}
