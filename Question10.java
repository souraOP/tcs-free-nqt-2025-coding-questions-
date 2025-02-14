/*
Question: Given an array of integer values, find all empty packets (represented by 0) and 
push them to the end of the array.
Test Case:

Input: arr = [2, 0, 3, 0, 5]

Output: [2, 3, 5, 0, 0]

Explanation: The empty packets represented by 0 are moved to the end while maintaining the 
order of the other elements.
 */

public class Question10 {
  public static void main(String[] args) {
    int[] arr= {2, 0, 3, 0, 5};
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] != 0) {
        arr[count++] = arr[i];
      }
    }
    while(count < arr.length) {
      arr[count++] = 0;
    }

    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
