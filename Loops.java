public class Loops {
  public static void main(String[] args) {
    // int x = 1;

    // while(x < 5) {
    //   System.out.println("I am x: " + x);
    //   int j = 1;
    //   while(j<=3) {
    //     System.out.println("I am j: " + j);
    //     j++;
    //   }

    //   x++;
    // }

    int n = 4;
    for(int i = 0;i < n; i++) {
      for(int j = 0; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    
  }
}
