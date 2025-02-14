/*
In a magical kingdom, the wizard Arithmo needs your help to find "Perfect Numbers." 
A perfect number is defined as a number that is equal to the sum of its proper divisors (excluding itself).
Write a program to check whether a given number is a perfect number or not.

Testcase:
Input:
6

Output:
6 is a perfect number.

Explanation:
The divisors of 6 are 1, 2, and 3. The sum of these divisors is 1+2+3=6, 1 + 2 + 3 = 6. Hence, 6
is a perfect number.
*/

import java.util.Scanner;

public class question3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    // find its divisor
    
    
    if(check(n)) {
      System.out.println(n + " is a perfect number");
    } else {
      System.out.println("Not a perfect number");
    }
  }

  private static boolean check(int n) {
    if(n < 2) {
      return false;
    }
    int c= 1;
    for(int i = 2; i < n-1; i++) {
      if(n % i == 0) {
        c += i;
      }
    }
    return c == n;
  }
}
