package BasicQuestions;

/*

Input: 1100
Output: 12

*/


import java.util.*;
public class BinaryToDecimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    sc.close();
    int ans = 0, i =0;
    while(n>0){
      int rem = n % 10;
      n /= 10;
      ans += rem * Math.pow(2, i);
      i++;
    }
    System.out.println(ans);


    // other approach
    // String str = String.valueOf(n);
    // System.out.println(Integer.parseInt(str, 2));
  }  
}
