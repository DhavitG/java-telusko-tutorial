public class ExceptionHandling {
  public static void main(String a[]) {
    int i = 0;
    int j = 0;

    try {
      j = 18/i;
    }
    catch(Exception e) {
      System.out.println("Something went wrong : " + e.getMessage());
    }

    System.out.println(j);

    System.out.println("End");
  }
}
