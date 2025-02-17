package BasicQuestions;

public class GCD {
  public static void main(String[] args) {
    int a = 36, b = 60;
    System.out.println(greatestCommonDivisor(a, b));
  }

  private static int greatestCommonDivisor(int a, int b){
    if(b == 0){
      return a;
    }
    return greatestCommonDivisor(b, a % b);
  }
}
