public class Demo {
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

}
