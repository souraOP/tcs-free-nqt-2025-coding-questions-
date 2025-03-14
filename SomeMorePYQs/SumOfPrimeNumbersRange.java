package SomeMorePYQs;

import java.util.*;

public class SumOfPrimeNumbersRange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt();
    sc.close();
    int sum = 0;
    List<Integer> list = new ArrayList<>();
    for(int i = n; i <= m; i++){
      if(isPrime(i)){
        list.add(i);
      }
    }
    for(int i = 0; i < list.size(); i++){
      sum += list.get(i);
    }
    System.out.println(sum);
  }

  static boolean isPrime(int i){
    if(i == 0 || i == 1){
      return true;
    }
    for(int j = 2; j < i/2; j++){
      if(i % j == 0){
        return false;
      }
    }
    return true;
  }
}
