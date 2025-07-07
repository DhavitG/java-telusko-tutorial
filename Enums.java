// enum extends an enum class (java.lang.Enum)

enum Status { // Status is like a class
  Running, Failed, Pending, Success; // these 4 are objects
}

public class Enums {
  public static void main(String a[]) {
    Status s = Status.Running;
    System.out.println(s);
    System.out.println(s.ordinal()); //gives back index (like arrays)
 
    switch (s) {
      case Running:
        System.out.println("All good");
        break;
      case Failed:
        System.out.println("Try again");
        break;
      case Pending:
        System.out.println("Please wait");
      default:
        System.out.println("Done");
        break;
    }
  }
}
