import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamAPI {
  public static void main(String a[]) {
    List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

    // int sum = 0;
    // for(int n: nums) {
    //   if(n%2==0) {
    //     n *= 2;
    //     sum += n;
    //   }
    // }
    // System.out.println(sum);
    // nums.forEach(n -> System.out.println(n));

    // Stream<Integer> s1 = nums.stream();
    // Stream<Integer> s2 = s1.filter(n->n%2==0);
    // Stream<Integer> s3 = s2.map(n -> n*2);

    //s1.forEach(n -> System.out.println(n)); //streams can be used only once though
    //s1.filter(n -> n%2==0); // returns a stream

    //s2.forEach(n -> System.out.println(n));
    //s3.forEach(n -> System.out.println(n));

    int result = nums.stream().filter(n -> n%2==0)
      .map(n -> n*2)
      .reduce(0, (c,e) -> c+e);

    System.out.println(result);
  }
}
