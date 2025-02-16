/*
Question: Count the frequency of each element in an array

Test Case:
- Input: arr = [1, 2, 1, 3, 2, 1]
- Output: {1: 3, 2: 2, 3: 1}

Explanation: Element 1 appears 3 times, 2 appears 2 times and 3 appears 1 time.
 */

import java.util.HashMap;

public class Question20 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 3, 2, 1};
    HashMap<Integer, Integer> mp = new HashMap<>();

    for(int i: arr){
      mp.put(i, mp.getOrDefault(i, 0) + 1);
    }
    // System.out.println(mp);

    
    // formatting the output
    StringBuilder formattedOutput = new StringBuilder("{");
    // create the entry set
    for(HashMap.Entry<Integer, Integer> ent: mp.entrySet()){
      formattedOutput.append(ent.getKey()).append(": ").append(ent.getValue()).append(", ");
    }
    System.out.println(formattedOutput.length());
    if(formattedOutput.length() > 1){
      formattedOutput.setLength(formattedOutput.length()-2);
    }
    formattedOutput.append("}");
    System.out.println(formattedOutput.toString());


  }
}
