package BasicQuestions;

import java.util.Scanner;

/*

Question: Sum of digits of a number
Input: 456
Output: 15

 */

public class SumOfDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int sum =0, org = n;
    while(org != 0) {
      int rem = org % 10; // 6 // 5 // 4
      sum += rem; // 6 // 6 + 5 = 11 // 11 + 4 = 15
      org /= 10; // 45 // 4 // 0
    }
    System.out.println(sum);
  }
}
