/*
Question: Given an integer array arr, find the count of elements whose value is greater than all of its prior elements

Test Case:

Input: arr = [1, 3, 2, 5, 4]
Output: 3

Explanation: The elements 1, 3 and 5 are greater than all previous elements.

 */

public class Question17 {
  public static void main(String[] args) {
    int[] arr = {1, 3, 2, 5, 4};
    System.out.println(solve(arr));
  }

  private static int solve(int[] arr ){
    int count = 1;
    for(int i = 1; i< arr.length;i++){
      if(arr[i] > arr[i - 1]){
        count++;
      }
    }
    return count;
  }

  // private static int solve(int[] arr){
  //   int c = 0;
  //   int getMax = Integer.MIN_VALUE;
  //   for(int n: arr){
  //     if(n > getMax){
  //       c++;
  //       getMax = n;
  //     }
  //   }
  //   return c;
  // }
}
