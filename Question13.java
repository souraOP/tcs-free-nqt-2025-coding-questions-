/*
Question: Find the element that appears only once in an 
array where every other element appears twice.

Test Case:
• Input: nums = [2, 2, 1, 4, 4]
• Output: 1

Explanation: The number 1 appears only once, while all other numbers appear twice.
*/

import java.util.*;
public class Question13 {
  public static void main(String[] args) {
    int[] nums = {2, 2, 1, 4, 4};
    System.out.println(solve(nums));
  }

  private static int solve(int[] arr){
    HashMap<Integer, Integer> mp = new HashMap<>();

    // key value 
    // store the array into the hashmap 
    for(int i = 0; i < arr.length; i++){
      mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
    }
    // check for single value
    for(int i = 0; i < arr.length; i++){
      if(mp.get(arr[i]) == 1){
        return arr[i];
      }
    }

    return -1;
  }
}
