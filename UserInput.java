// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

import java.util.Scanner;

public class UserInput {
  /*
  Input using buffered reader

  public static void main(String a[]) throws IOException{
    System.out.println("Enter a number");

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(in);

    int num = Integer.parseInt(bf.readLine());
    System.out.println(num);

    bf.close();
  }
     */

  public static void main(String a[]) {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    System.out.println(num);
  }
}
