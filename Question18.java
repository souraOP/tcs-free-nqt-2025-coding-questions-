/*
Question: Given an array of risks level (integers ranging from 0 to 2), sort the array based on these risk levels

Test cases:
Input: riskLevels = [2, 0, 1, 2, 0, 1]
Output: [0, 0, 1, 1, 2, 2]

Explanation: The array is sorted in ascending order of risk levels
 */

// import java.util.Arrays;

public class Question18 {
  public static void main(String[] args) {
    int[] arr = {2, 0, 1, 2, 0, 1};
    // solve(arr);
    insertionSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // using library function - O(N log n)
  // private static void solve(int[] arr){
  //   Arrays.sort(arr);
  // }

  // using insertion sort
  private static void insertionSort(int[] arr){
    int n =arr.length;
    for(int i = 1; i < n; i++){
      int key = arr[i];
      int j = i-1;
      while(j >= 0 && arr[j] > key){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=key;
    }
  }
}
