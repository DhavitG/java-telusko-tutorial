import java.util.HashMap;
import java.util.Map;
// keys are unique - set
// values can be same - list
// maps: combination of set and lists

public class Maps {
  public static void main(String a[]) {
    Map<String, Integer> students = new HashMap<>();
      students.put("Dhavit", 21);
      students.put("Harsh", 70);
      students.put("John", 22);
      students.put("Doe", 18);

      System.out.println(students);
      System.out.println(students.get("Dhavit"));
      System.out.println(students.keySet());

      for(String name : students.keySet()) {
        System.out.println(name + " : " + students.get(name));
      }
  }
}
