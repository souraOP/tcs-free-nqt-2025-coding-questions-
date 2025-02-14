/*
Write a program to find and print all strong numbers from a given integer array. 
A strong number is defined as a number equal to the sum of the factorial of its digits.
Testcase:

Input:
[1, 2, 145, 10]

Output:
[1, 145]

Explanation:
145 is a strong number because 1!+4!+5! = 145; 1! + 4! + 5! = 145
 */

import java.util.*;

public class Question9 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 145, 10};

    List<Integer> ans = findStrongNumber(arr);
    System.out.println(ans);
    
  }

  private static List<Integer> findStrongNumber(int[] arr) {
    List<Integer> sNums = new ArrayList<>();

    for(int it: arr) {
      if(isStrongNumber(it)){
        sNums.add(it);
      }
    }
    return sNums;
  }

  private static boolean isStrongNumber(int a){
    int sum = 0, orgNum = a;
    while(a > 0) {
      int rem = a%10;
      sum += fibo(rem);
      a /= 10;
    }
    // if(sum == orgNum) {
    //   return true;
    // }
    // return false;
    return sum == orgNum;
  }

  private static int fibo(int x) {
    if(x == 1 || x == 0) return 1;
    int result = 1;
    for(int i = 2; i <= x; i++) {
      result *= i;
    }
    return result;
  }

}
