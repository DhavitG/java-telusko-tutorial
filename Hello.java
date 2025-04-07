public class Hello {
  private static String greeting = "Hello";

  public static void greetUser(String name) {
      System.out.println(greeting + ", " + name + "!");
  }

  public static void main(String[] args) {
      if (args.length > 0) {
          greetUser(args[0]);
      } else {
          System.out.println("Hello, World!");
          System.out.println("Tip: Run again with your name as an argument :)");
      }
  }
}
