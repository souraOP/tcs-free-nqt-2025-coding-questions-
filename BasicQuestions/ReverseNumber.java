/*
Reverse a given number

Input : 12345
Output: 54321

*/



package BasicQuestions;

import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int rev=0;
    while(n > 0) {
      int rem = n %10;
      rev = rev * 10 + rem;
      n /= 10;
    }
    System.out.println(rev);
  }
}
