/*
Question: Find two numbers in an array that add up to a specific target.
Test Case:

Input: nums = [2, 7, 11, 15], target = 9

Output: [0, 1]

Explanation: The numbers at indices 0 and 1 (2 + 7 ) sum up to the target 9.
 */
import java.util.*;
public class Question11 {
  public static void main(String[] args) {
    int[] nums={2,7,11,15};
    int target = 9;
    // int[] ans = func(nums, target);
    // for (int i = 0; i < ans.length; i++) {
    //   System.out.print(ans[i] + " ");
    // }

    List<Integer> ans = func(nums, target);
    System.out.println(ans);
    
  }

  // private static int[] func(int[] nums, int target) {
  //   for(int i = 1; i < nums.length; i++) {
  //     if(nums[i] + nums[i-1] == target) {
  //       return new int[] {i, i-1};
  //     }
  //   }
  //   return new int[] {};
  // }
  
  private static List<Integer> func(int[] arr, int target) {
    List<Integer> ans = new ArrayList<>(0);
    for (int i = 1; i < arr.length; i++) {
      if(arr[i-1] + arr[i] == target) {
        ans.add(i-1);
        ans.add(i);
        return ans;
      }
    }
    return ans;
  }
}
