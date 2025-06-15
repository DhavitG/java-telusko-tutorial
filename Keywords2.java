abstract class Car{
  public abstract void drive(); //when u dont know what to put in and just want to declare for future use 

  public void playMusic() {
    System.out.println("playing music");
  }
}

class XUV extends Car {
  public void drive() {
    System.out.println("driving");
  }
}

public class Keywords2 {
  public static void main(String a[]) {
    Car obj = new XUV(); // cannot create object of abstract class
    obj.drive();
    obj.playMusic();
  }
}
