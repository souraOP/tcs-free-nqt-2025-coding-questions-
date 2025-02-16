/*
Question: Sort the elements of an array by their frequency of occurrence.

Test Case:

• Input: arr = [2, 5, 2, 8, 5, 6, 8, 8]
• Output: [8, 8, 8, 2, 2, 5, 5, 6]

Explanation: Elements are sorted in decreasing order of frequency, with ties broken by original appearance.
 */

import java.util.*;

class Pair {
  int element;
  int count;
  Pair(int element, int count){
    this.element = element;
    this.count = count;
  }
}

public class Question27 {
  public static void main(String[] args) {
    int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};

    // hashmap mein daldo pehle to get the frequency
    HashMap<Integer, Integer> mp = new HashMap<>();
    for(int i = 0; i < arr.length; i++){
      mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
    }

    // next arraylist banao with class element with their count
    ArrayList<Pair> list = new ArrayList<>();

    for(int x: mp.keySet()){
      list.add(new Pair(x, mp.get(x)));
    }
    Collections.sort(list, (a,b)-> {
      if(a.count == b.count){
        return a.element - b.element;
      } else {
        return b.count - a.count;
      }
    });

    for(int i = 0; i < list.size(); i++){
      while(list.get(i).count > 0) {
        System.out.print(list.get(i).element + " ");
        list.get(i).count--;
      }
    }

  }
}
