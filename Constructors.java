class Human {
  private int age;
  private String name;

  //everytime you create a new object, the constructor is called
  public Human() { // default constructor
    age = 12;
    name = "Dhavit";
  }

  public Human(int age, String name) { // parametrized constructor
    this.age = age;
    this.name = name; 
  }

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

public class Constructors {
  public static void main(String a[]) {
    Human obj = new Human(18, "Dhavit");

    // obj.setAge(13);
    // obj.setName("Dhavit");

    System.out.println(obj.getName() + " : " + obj.getAge() + " years old.");
  }
}
