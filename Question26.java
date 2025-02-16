/*
Question: Find the third maximum number in an array.
Test Case:

• Input: arr = [3, 2, 1, 5, 6]
• Output: 3

Explanation: The third largest number in the sorted order [6, 5, 3, 2, 1] is 3.

*/


public class Question26 {
  public static void main(String[] args) {
    int[] arr = {3, 2, 1, 5, 6};
    int n = arr.length;
    int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

    for(int i = 1; i < n; i++) {
      first = Math.max(first, arr[i]);
    }
    for(int i = 0; i < n; i++){
      if(arr[i] != first && arr[i] >= second){
        second = arr[i];
      }
    }

    for(int i = 0; i < n; i++) {
      if(arr[i] != first && arr[i] != second && arr[i] >= third){
        third = arr[i];
      }
    }
    // System.out.println("1st: "+ first);
    // System.out.println("2nd: "+ second);
    System.out.println(third);
  }
}
