package BasicQuestions;

import java.util.*;

/*

Question: Find all palindrome numbers in the range of A to B
Input: A = 100, B = 150
Output: [101, 111]

*/

public class PalindromeRange {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    int a = 100, b = 150;
    ArrayList<Integer> list= new ArrayList<>();
    for(int i = a; i <= b; i++) {
      if(isPalindrome(i)){
        list.add(i);
      }
    }
    System.out.println(list);
  }
  private static boolean isPalindrome(int n){
    int rev = 0, org = n;
    while(n > 0){
      int rem = n % 10;
      rev = rev * 10 + rem;
      n /= 10;
    }
    if(org == rev){
      return true;
    }
    return false;
  }
}
