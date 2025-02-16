/*
Question: Find the smallest and second smallest elements in an array.

Test Case:

• Input: arr = [12, 13, 1, 10, 34, 1]
• Output: Smallest: 1, Second Smallest: 10

Explanation: The smallest element is 1, and the second smallest is 10.

*/

// import java.util.Arrays;

public class Question25 {
  public static void main(String[] args) {
    int[] arr = {12, 13, 1, 10, 34};
    smallestAndSecondSmallest(arr);
  }

  private static void smallestAndSecondSmallest(int[] arr){
    int n = arr.length;
    int getMin = Integer.MAX_VALUE, secondMin = arr[0];
    for(int i = 0; i < n; i++){
      getMin = Math.min(getMin, arr[i]);
    }
    for(int i = 0; i < n; i++) {
      if(arr[i] != getMin && arr[i] <= secondMin){
        secondMin = arr[i];
      }
    }
    System.out.println(secondMin);
    System.out.println(getMin);
  }

  // O(N log N)
  // private static void smallestAndSecondSmallest(int[] arr){
  //   Arrays.sort(arr);
  //   int minn = arr[0];
  //   int secondMin = arr[1];
  //   System.out.println(minn);
  //   System.out.println(secondMin);
  // }
}
