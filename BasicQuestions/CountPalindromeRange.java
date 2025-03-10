package BasicQuestions;

import java.util.Scanner;

/*
 (print the total number of palindrome between the given range m and n,0<=m,n<=1000)
For example input1 (lowest range =0 and Highest range =20)
Input: 0 20
Output: 11
Reason: 0,1,2,3,4,5,6,7,8,9,11
These numbers are palindrome
 */

public class CountPalindromeRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    sc.close();
    int count = 0;
    for(int i = a; i <= b; i++){
      if(is_palindrome(i)){
        count++;
      }
    }
    System.out.println(count);
  }

  static boolean is_palindrome(int i){
    int org_num = i;
    int rev= 0;
    while(i > 0){
      rev = rev*10 + i % 10;
      i /= 10;
    }
    return org_num == rev;
  } 
}
