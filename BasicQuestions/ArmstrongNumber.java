package BasicQuestions;

/*

Question: Armstrong number check
Input: 153
Output: True (153 is an Armstrong number)

 */

public class ArmstrongNumber {
  public static void main(String[] args) {
    int n = 153;
    if(stringArmstrong(n)){
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }

  // private static boolean isArmstrong(int n) {
  //   int i = 0;
  //   int sum = 0, org = n;
  //   while(org != 0){
  //     i++;
  //     org /= 10;
  //   }
  //   int temp = n;
  //   while(temp != 0){
  //     int rem = temp % 10;
  //     sum += Math.pow(rem, i);
  //     temp /= 10;
  //   }
  //   return sum == n;
  // }

  private static boolean stringArmstrong(int n){
    String num = Integer.toString(n);
    long op = 0;
    for(char i: num.toCharArray()){
      op += (long)Math.pow(i-'0', num.length());
    }
    return op == n;
  }
}
