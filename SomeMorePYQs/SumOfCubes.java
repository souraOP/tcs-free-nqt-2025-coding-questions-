package SomeMorePYQs;

import java.util.*;

public class SumOfCubes {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt();
    sc.close();
    int sum = 0;
    for(int i = n; i <= m; i++){
      sum += (i * i * i);
    }
    System.out.println("Sum of cubes from " + n + " to " + m + " is: " + sum);
  }
}
