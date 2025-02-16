/*
Question 24: Calculate the mean and median of an unsorted array.

Test Case:

Input: arr = [1, 3, 4, 2, 6]
Output: Mean: 3.2, Median: 3

Explanation: The mean is the sum of elements divided by the count (16/5 = 3.2), and the
median is 3

*/


public class MeanAndMedianSortedArray {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 2, 6};
    int n = arr.length;
    float sum =0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("Mean: " + (sum/n));
    System.out.println("Median" + n/2);

  }
}
