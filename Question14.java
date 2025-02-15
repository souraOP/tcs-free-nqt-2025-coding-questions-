/*

Given an array of integers and an integer sum, 
return the total number of subarrays whose sum equals the given value.

Test Case:
• Input: nums = [1, 2, 3, 1, 1, 1], sum = 3
• Output: 4

Explanation: The subarrays [1, 2], [3], [1, 1, 1], and [2, 1] all have a sum equal to 3
*/

import java.util.Scanner;

public class Question14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    int sum = sc.nextInt();
    sc.close();
    System.out.println(sumOfSubarray(arr, sum));
  }

  private static int sumOfSubarray(int[] arr, int sum){
    int s = 0, count =0;
    int n = arr.length;
    for (int i = 0; i < arr.length; i++) {
      s=0;
      for(int j = i; j < n; j++){
        s += arr[j];
        if(s == sum){
          count++;
        }
      }
    }
    return count;

  }
}
