/*
Question: Given an array of strings, remove all the duplicate strings and return the uploaded array

Test Cases:

Input: arr = ["apple", "banana", "apple", "orange"]
Output: ["apple", "banana", "orange"]

Explanation: Duplicate occurences of "apple" are removed

*/

import java.util.*;

public class Question16 {
  public static void main(String[] args) {
    String[] str= {"apple", "banana", "apple", "orange"};
    // System.out.println(removeDuplicateString(str));
    System.out.println(Arrays.toString(removeDuplicatesHashset(str)));
  }

  // private static String removeDuplicateString(String[] arr){
  //   StringBuilder sb = new StringBuilder();
  //   for(int i =0; i< arr.length; i++){

  //   }
  // }
  
  private static String[] removeDuplicatesHashset(String[] arr){
    HashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
    String[] res = new String[set.size()];
    set.toArray(res);
    return res;
  }

}
