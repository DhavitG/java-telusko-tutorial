public class Strings {
  public static void main(String args[]) {
    String name = new String("dhavit"); // immutable - reference might change if some operation is performed i.e, new object created with same name and new address and now you look at the new address

    System.out.println("Hello " + name);
    // System.out.println(name.charAt(3));

    StringBuffer sb = new StringBuffer("dhavit");
    sb.append(" g");
    sb.deleteCharAt(4);

    System.out.println(sb); // dhavit g - hence sb has been changed
  }
}
