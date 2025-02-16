/*
Question: Add a new element to the end of an array

Test case:
Input: arr = [1, 2, 3], element = 4
Output: [1, 2, 3, 4]

Explanation: The element 4 is added to the end of the array.

*/


public class Question21 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int[] res = new int[arr.length + 1];
    int element = 4;
    for(int i = 0; i < arr.length; i++){
      res[i] = arr[i];
    }
    res[arr.length] = element;
    for (int i = 0; i < res.length; i++) {
      System.out.print(res[i] + " ");
    }
  }
}
