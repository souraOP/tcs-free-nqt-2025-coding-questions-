/*
Question: Check if there are any duplicates in an array

Test Case:
Input: arr = [1, 2, 3, 1]
Output: True

Explanation: The number 1 appears twice in the array
*/

import java.util.*;

public class Question22 {
  public static void main(String[] args) {
    int[] arr = {1, 5, 2, 3, 4};
    System.out.println(solve(arr));
  }

  // O(N^2)

  // private static boolean solve(int[] arr){
  //   for(int i = 0; i < arr.length; i++){
  //     for(int j = i; j < arr.length; j++){
  //       if(arr[i] == arr[j]){
  //         return true;
  //       }
  //     }
  //   }
  //   return false;
  // }


  // private static boolean solve(int[] arr){
  //   int n =arr.length;
  //   HashMap<Integer, Integer> mp = new HashMap<>();
  //   for(int i =0; i < n; i++){
  //     mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
  //   }
  //   for(HashMap.Entry<Integer, Integer> entry: mp.entrySet()){
  //     if(entry.getValue() > 1){
  //       return true;
  //     }
  //   }
  //   return false;
  // }

  // another approach
  private static boolean solve(int[] arr){
    HashMap<Integer, Integer> mp = new HashMap<>();
    for(int x: arr){
      if(mp.containsKey(x)){
        return true;
      }
      mp.put(x, 1);
    }
    return false;
  }
}
