class Student {
  int rollno;
  String name;
  int marks;

}

 public class Arrays2 {
  public static void main(String a[]) {
    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Dhavit";
    s1.marks = 100;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Sachin";
    s2.marks = 94;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "Virat";
    s3.marks = 43;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    // for(int i = 0; i < students.length; i++) {
    //   System.out.println(students[i].name + " has scored " + students[i].marks + " marks.");
    // }

    for(Student n : students) {
      System.out.println(n.name);
    }
  }
}
