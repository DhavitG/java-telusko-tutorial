class Human {
  // private int age = 13;
  // private String name = "Dhavit";

  // binding data with methods
  private int age;
  private String name;

  public void setAge(int a) {
    age = a;
  }

  public int getAge() {
    return age;
  }

  public void setName(String str) {
    name = str;
  }
  public String getName() {
    return name;
  }
}

public class Encapsulation {
  public static void main(String a[]) {
    Human obj = new Human();
    // obj.age = 13;
    // obj.name = "dhavit";

    obj.setAge(13);
    obj.setName("Dhavit");

    System.out.println(obj.getName() + " : " + obj.getAge() + " years old.");
  }
}
