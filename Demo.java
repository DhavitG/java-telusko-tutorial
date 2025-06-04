class Calculator {
  int num1 = 4;
  int num2 = 5;

  public int add(int num1, int num2) {
    int r = num1 + num2;
    return r;
  }
}

public class Demo {
  /* 
  public static void main(String[] args) {
    int x = 8;
    int y = 7;
    int z = 6;

    if (x>y && x>z) {
      System.out.println(x);
    }
    else if(y > z){
      System.out.println(y);
    }
    else {
      System.out.println(z);
    }

    int m = 9;
    int result = m > 10 ? 1 : 0;
  
    System.out.println("Result is " + result + " which is a " + (result == 0 ? "false value" : "true value"));
  }
  */

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    int result = calc.add(calc.num1, calc.num2);
    System.out.println(result);
  }
}