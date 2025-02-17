package BasicQuestions;

import java.util.Scanner;

/*

Question: Find Armstrong numbers in the range of A to B
Input: A = 100, B = 500
Output: [153, 370, 371, 407]

*/
import java.util.*;

public class ArmstrongRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 100, b = 500;
    sc.close();
    List<Integer> list = new ArrayList<>();
    for (int i = a; i <= b; i++) {
      if(isArmstrong(i)){
        list.add(i);
      }
    }
    System.out.println(list);

  }

  private static boolean isArmstrong(int i){
    int sum = 0, temp = i, n=0;
    while(temp != 0){
      n++;
      temp /= 10;
    }
    int org = i;
    while(org != 0){
      int rem = org % 10;
      sum += Math.pow(rem, n);
      org /= 10;
    }
    return sum == i;

  }
}
