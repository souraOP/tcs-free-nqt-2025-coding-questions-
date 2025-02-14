/*
Given an integer array and a target value, find all pairs of elements where the difference
 between the elements is equal to the target. Return the list of such pairs.

Testcase:
Input:
nums = [4, 8, 6, 2], target = 4

Output:
[(8, 4), (6, 2)]

Explanation:
The differences between elements 8 and 4, as well as 6 and 2, equal the target value 4.
*/

import java.util.ArrayList;
import java.util.List;

public class Question7 {
  public static void main(String[] args) {
    int[] nums={4, 8, 6, 2};
    int target = 4;
    List<int[]> pairs = func(nums, target);
    for(int[] pair: pairs) {
      System.out.print("(" + pair[0] + ", " + pair[1] + ") ");
    }

    
  }
  private static List<int[]> func(int[] arr, int target) {
    List<int[]> ans = new ArrayList<>();
    for(int i = 0; i < arr.length; i++) {
      for(int j = i + 1; j < arr.length; j++) {
        if(Math.abs(arr[i] - arr[j]) == target) {
          ans.add(new int[]{arr[i], arr[j]});
        }
      }
    }
    return ans;
  }
}
