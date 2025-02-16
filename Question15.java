/*
Question: Given an integer array nums, find the subarray with the largest sum and return its sum.

Test Case:

Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

• Output: 6

Explanation: The subarray [4, -1, 2, 1] has the largest sum of 6

*/

import java.util.Scanner;

public class Question15 {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int[] arr =new int[n];
    // for(int i = 0; i < n; i++){
    //   arr[i] = sc.nextInt();
    // }
    // sc.close();
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int n = arr.length;
    // Arrays.sort(arr);
    // for(int i = 0; i < n; i++){
    //   System.out.print(arr[i] + " ");
    // }
    System.out.println(solve(arr, n));
  }

  private static int solve(int[] arr, int n){
    // O(N^2)

    // int getMax = arr[0];
    // for(int i = 0; i < n; i++){
    //   int sum = 0;
    //   for(int j = i; j < n; j++){
    //     sum += arr[j];
    //     getMax = Math.max(getMax, sum);
    //   }
    // }
    // return getMax;

    // O(N) solution:
    int getMax = arr[0];
    int sum = 0;
    for(int i = 0; i < n; i++){
      sum += arr[i];
      getMax = Math.max(getMax, sum);
      if(sum < 0){
        sum = 0;
      }
    }
    return getMax;
  }
}
