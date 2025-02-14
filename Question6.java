/*
Given an integer array nums, find the count of pairs (i, j) where i < j and nums[i] - nums[j] = k

Testcase:
Input:
nums = [1, 2, 2, 1, 1], k = 1

Output:
4

Explanation:
The valid pairs are:

(2, 1), (2, 1), (2, 1), and (2, 1) where the difference between the elements
equals k = 1.
*/


public class Question6 {
  public static void main(String[] args) {
    int[] nums = {1, 2, 2, 1, 1};
    int k = 1;
    System.out.println(countPairs(nums, k));
  }

  private static int countPairs(int[] arr, int k) {
    int c = 0, i =0;
    while(i < arr.length) {
      int j = i + 1;
      while(j < arr.length) {
        if(arr[i] - arr[j] == k) {
          c++;
        }
        j++;
      }
      i++;

    }
    return c;
  }
}
