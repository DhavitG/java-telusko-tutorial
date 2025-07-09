// class A extends Thread{ // its not an ordinary class now ; its a thread
class A implements Runnable {
  public void run() {
    for(int i = 0; i<10; i++) {
      System.out.println("high");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class B implements Runnable{
  public void run() {
    for(int i = 0; i<10; i++) {
      System.out.println("low");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class Threads {
  public static void main(String a[]) {
    Runnable obj1 = new A(); 
    Runnable obj2 = new B();

    // obj1 becomes a runnable object
    // one of the thread class constructors takes runnable object as parameter
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();
  }
}
