/*
Question: Find duplicates in an array in linear time and constant space.

Test Case:
  Input: arr = [4, 3, 2, 7, 8, 2, 3, 1]
  Output: [2, 3]

Explanation: The number 2 and 3 appear more than once.

*/

import java.util.*;

public class Question23 {
  public static void main(String[] args) {
    int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> dp = solve(arr);
    System.out.println(dp);
  }

  private static List<Integer> solve(int[] arr){
    List<Integer> duplicates = new ArrayList<>();
    HashMap<Integer, Integer> mp = new HashMap<>();
    for(int n: arr){
      if(mp.containsKey(n)){
        duplicates.add(n);
      }
      mp.put(n, 1);
    }
    return duplicates;

  }
}
