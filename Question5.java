/*
Given an integer, return true/True if the sum of its digits is even; otherwise, return false/False.

Testcase:
Input:
123

Output: true/True

Explanation:
The sum of the digits 1+2+3=6 1 + 2 + 3 = 6 is an even number, so the output is true/True.
 */

public class Question5 {
  public static void main(String[] args) {
    int n1 = 101, n2= 123, n3 = 542, n4=20412, n5=1, n6=0;
    func(n1);
    func(n2);
    func(n3);
    func(n4);
    func(n5);
    func(n6);
    
    
    
  }

  private static void func(int n) {
    int rem = 0, sum=0;
    while(n > 0) {
      rem = n % 10;
      sum += rem;
      n/=10;
    }
    if(sum % 2 == 0) {
      System.out.println("true/True");
    } else {
      System.out.println("false/False");
    }

  }
}
