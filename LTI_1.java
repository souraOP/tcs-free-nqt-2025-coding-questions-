/*

 */

import java.util.Scanner;

public class LTI_1 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt(); //no. of book he has to buy that day
    int[] earnArray = new int[n];
    int[] costArray = new int[n];
    for(int i = 0; i < n; i++){
      earnArray[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++) {
      costArray[i] = sc.nextInt();
    }
    sc.close();
    System.out.println(solve(n, earnArray, costArray));
  }

  static int solve(int n, int[] ea, int[] ca) {
    int sum = 0, sum2=0;
    for(int i = 0; i < n; i++) {
      sum += ea[i];
      sum2 += ca[i];
    }
    return Math.abs(sum2-sum);
  }
}
