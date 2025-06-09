/*
class Mobile {
  String brand;
  int price;
  static String name; // All objects will have the same name
  // static variables are shared by all objects

  static {
    name = "Phone"; 
  }

  public Mobile() { // everytime you create an object constructor will be called
    brand = " ";
    price = 200;
    // name = "Phone"; // no need here we need to call this only once-so put in static block.
  }
  
  public void show() {
    System.out.println(brand + " " + name + " is for " + price + " dollars");
  }
}

public class Demo2 {
  public static void main(String a[]) {
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1000;
    Mobile.name = "SmartPhone";

    obj1.show();
  }
}

*/

class Mobile {
  String brand;
  int price;
  static String name;
  
  public void show() {
    System.out.println(brand + " " + name + " is for " + price + " dollars");
  }

  // can call directly with the help of a class name
  // can only use a static variable inside a static method not a non-static variable
  // to call a non-static method you need to create an object of the class - ERGO OUR MAIN METHOD IS STATIC SO WE CAN JUST CALL THAT SHI
  public static void show1() {
    System.out.println(name);
  }

  public static void show2(Mobile obj) {
    System.out.println(obj.brand + " " + name + " is for " + obj.price + " dollars");
  }
}

public class Static {
  public static void main(String a[]) {
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1000;
    Mobile.name = "SmartPhone";

    //obj1.show();

     Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 700;
    Mobile.name = "SmartPhone";

    //obj2.show();

    Mobile.show1();
    Mobile.show2(obj1);
    Mobile.show2(obj2);
  }
}