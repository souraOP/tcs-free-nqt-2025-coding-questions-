package BasicQuestions;

public class CheckPalindrome {
  public static void main(String[] args) {
    int n = 121;
    if(isPalindrome(n)){
      System.out.println("True");
    } else{
      System.out.println("False");
    }
  }

  private static boolean isPalindrome(int n){
    int rev = 0, org = n;
    while(org != 0){
      int r = org % 10;
      rev = rev * 10 + r;
      org /= 10;
    }
    return rev == n;
  }
}
