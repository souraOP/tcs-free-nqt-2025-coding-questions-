/*
Furnishing Company Curtain Color Counting
Problem: Given a string of curtain colors represented by 'a' for aqua
and 'b' for black, and an integer L , find the number of aqua color
curtains in the box with the maximum number of aqua color curtains.

Test Case:
Input: str = "abbbaabbb", L = 5
Output: 2

Dividing the string into sets of 5 characters each.
Set 1: {a,b,b,b,b}
Set 2: {a,a,b,b,b}
Among both the sets, set 2 has more number of a’s. The number of a’s in set 2 is 2.

*/

import java.util.Scanner;

public class CompanyColorCounting_Strings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int L = sc.nextInt();
    System.out.println(countColours(str, L));
    sc.close();
  }

  static int countColours(String str, int l) {
    int count = 0, max = 0;
    // traverse the string
    for(int i = 0; i < str.length(); i++) {
      // if we get a substring i.e it will divide completely at that L value
      if(i % l == 0) {
        // we get the maximum value between our required count and max value
        max = Math.max(count, max);
        // since this if block will execute after getting the start position of the substring
        // we initialize the count to zero again
        count=0;
      }
      // this if block executes when we get an 'a' i.e aqua 
      if(str.charAt(i) == 'a'){
        // and increment the count value
        count++;
      }
    }
    return Math.max(count, max);
  }
}
