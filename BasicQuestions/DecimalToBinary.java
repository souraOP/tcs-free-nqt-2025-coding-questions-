package BasicQuestions;

import java.util.Scanner;

// 12 -> 
public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    // using toBinaryString()
    // String si = Integer.toBinaryString(n);
    // System.out.println(si);
    int r= 1;
    int b=0, rem;
    while(n > 0){
      rem = n%2;
      n /= 2;
      b = b + (rem * r);
      r = r * 10;
    }
    System.out.println(b);

  }
}
