package BasicQuestions;

import java.util.*;

/*

Question: Prime Number in the given range
Input: A = 10, B = 30
Output: [11, 13, 17, 19, 23, 29]

*/

public class PrimeNumberRange {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    int a = 10, b =30;
    List<Integer> list = new LinkedList<>();
    for(int i = a; i <= b; i++) {
      if(isPrime(i)){
        list.add(i);
      }
    }
    System.out.println(list);
  }

  private static boolean isPrime(int n){
    if(n == 1 || n == 0){
      return true;
    }
    for(int i = 2; i < n/2; i++) {
      if(n%i == 0) {
        return false;
      }
    }
    return true;
  }
}
