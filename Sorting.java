import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
  public static void main(String a[]) {
    List<Integer> nums = new ArrayList<>();
    nums.add(41);
    nums.add(72);
    nums.add(83);
    nums.add(14);

    Collections.sort(nums);

    System.out.println(nums);

    /* SORTING USING CUSTOM LOGIC
    
    Comparator<Integer> com = new Comparator<Integer>() {
      public int compare(Integer i, Integer j) {
        if(i%10 > j%10) 
          return 1; //swap
        else 
          return -1; // no swap
      }
    };

    /*
    THE ABOVE IS THE SAME AS
    class MyComparator implements Comparator<Integer> {
      public int compare(Integer i, Integer j) {
        ...
      }
    }
    Comparator<Integer> com = new MyComparator();

    Collections.sort(nums, com);
     */
  }
}
