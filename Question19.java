/*

Question: Determine if a given array is sorted in non-decreasing order.

Test Case:
  Input: arr = [1, 2, 3, 5, 4]
  Output: False

Explanation: The array is not sorted as 5 = 4

*/

public class Question19 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 5, 4};
    int n = arr.length;
    System.out.println(solve(arr, n));
  }
  private static boolean solve(int[] arr, int n){
    int c= 0;
    for(int i =1; i < n; i++){

      if(arr[i - 1] > arr[i]){
        c++;
      }
    }
    if(c == n){
      return true;
    }
    return false;
  }
}
