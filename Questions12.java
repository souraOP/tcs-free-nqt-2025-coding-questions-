import java.util.Scanner;

/*
Question: Rotate an array to the right K times and print the result.

Test Case:
• Input: arr = [1, 2, 3, 4, 5], K = 2
• Output: [4, 5, 1, 2, 3]

Explanation: After rotating the array 2 times to the right, the result is [4, 5, 1, 2, 3]

*/

import java.util.*;
public class Questions12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr =new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    sc.close();
    int[] res = rotateArrayRight(arr, k);
    for(int i = 0; i < res.length; i++){
      System.out.print(res[i] + " ");
    }
  }
  private static int[] rotateArrayRight(int[] arr, int k){
    // int c = 0;
    int n = arr.length;
    k=k%arr.length;
    Queue<Integer> qq = new LinkedList<>();
    for(int i = n-k; i < n; i++){
      qq.add(arr[i]);
    }
    for(int i = 0; i < n-k; i++){
      qq.add(arr[i]);
    }
    for (int i = 0; i < n; i++){
      arr[i] = qq.remove();
    }
    return arr;
  }

}
