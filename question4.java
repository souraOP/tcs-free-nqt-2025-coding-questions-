/* 
Given a space-separated string of words, write a function to count the frequency of each word in the string. 
The output should display each unique word followed by its frequency, 
with the words in the order of their first appearance.

Testcase:
Input:
apple banana apple orange banana apple

Output:
apple 3 banana 2 orange 1

Explanation:
The word "apple" appears 3 times, "banana" appears 2 times, and "orange" appears 1 time in the string. 
The order of appearance is maintained.
*/

import java.util.*;

public class question4 {
  public static void main(String[] args) {
    String str= "apple banana apple orange banana apple";
    System.out.println(func(str));
  }

  private static String func(String str) {
    String[] words = str.split(" ");

    Map<String, Integer> mp = new LinkedHashMap<>();
    for(int i = 0; i < words.length; i++) {
      if(mp.containsKey(words[i])) {
        mp.put(words[i], mp.get(words[i])+1);
      } else {
        mp.put(words[i], 1);
      }
    }

    // converting the map to string
    StringBuilder sb = new StringBuilder();
    for(Map.Entry<String, Integer> entry: mp.entrySet()) {
      sb.append(entry.getKey()).append(" ").append(entry.getValue()).append(" ");
    }
    return  sb.toString().trim();
    
  }
}
