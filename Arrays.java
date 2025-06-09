public class Arrays {
  public static void main(String a[]) {
    /*
    // int nums[] = {3, 7, 2, 4};
    int nums[] = new int[4]; // right now empty blocks, no values
    nums[1] = 6;

    for(int i = 0; i < 4; i++) {

      System.out.println(nums[i]);
    }
    */

    /////////////////////////////
    // MULTI-DIMENSIONAL ARRAYS
    // nums is an array of arrays - it has 3 elements and each element(an array) has 4 elements
    // int nums[][] = new int[3][4];
    // for(int i = 0; i < 3; i++) {
    //   for(int j = 0; j < 4; j++) {
    //     nums[i][j] = (int)(Math.random() * 100);
    //   }
    // }

    // for(int i = 0; i < 3; i++) {
    //   for(int j = 0; j < 4; j++) {
    //     System.out.print(nums[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    // JAGGED ARRAY
    int nums[][] = new int[3][];

    // individually mention how many elements each array has
    nums[0] = new int[3];
    nums[1] = new int[4];
    nums[2] = new int[2];


    for(int i = 0; i < nums.length; i++) {
      for(int j = 0; j < nums[i].length; j++) {
        nums[i][j] = (int)(Math.random() * 100);
      }
    }

    for(int i = 0; i < nums.length; i++) {
      for(int j = 0; j < nums[i].length; j++) {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }
  }
}
