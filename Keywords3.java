class DhavitException extends Exception {
  public DhavitException(String str) {
    super(str);
  }
}

public class Keywords3 {
  public static void main(String a[]) {
    int i = 20;
    int j = 0;

    try {
      j = 18/i;
      if(j==0) {
        throw new DhavitException("we dont print zero - Dhavit");
      }
    }
    catch(DhavitException e) {
      j = 18/1;
      System.out.println("That's the default output : " + e.getMessage());
    }
    catch(Exception e) {
      System.out.println("Something went wrong : " + e.getMessage());
    }

    System.out.println(j);

    System.out.println("End");
  }

}
