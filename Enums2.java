enum Laptop {
  // constructor called within class so its private
  // fixed number of instances
  Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);

  private final int price;

  private Laptop(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}

public class Enums2 {
  public static void main(String a[]) {
    Laptop lap = Laptop.Macbook;
    Laptop[] laps = Laptop.values();
    
    for(int i = 0; i<laps.length; i++) {
      System.out.println(laps[i] + " : $" + laps[i].getPrice());
    }
  }
}
