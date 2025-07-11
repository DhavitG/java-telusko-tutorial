import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Student {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String toString() {
    return "Student [age=" + age + ", name: " + name + "]";
  }
}

public class Sorting2 {
  public static void main(String a[]) {
    Comparator<Student> com = new Comparator<Student>() {
      public int compare(Student i, Student j) {
        if(i.age > j.age) {
          return 1;
        } else {
          return -1;
        }
      }
    };


    List<Student> studs = new ArrayList<>();
    studs.add(new Student(21, "Dhavit"));
    studs.add(new Student(20, "Garv"));
    studs.add(new Student(22, "Doshi"));
    studs.add(new Student(21, "huhu"));

    Collections.sort(studs, com);
    
    for(Student s: studs) 
      System.out.println(s.name + " : " + s.age + " years old.");

  }
}
