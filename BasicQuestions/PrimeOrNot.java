package BasicQuestions;

public class PrimeOrNot {
  public static void main(String[] args) {
    int n = 12;
    if(isPrime(n)){
      System.out.println("True");
    }else {
      System.out.println("False");
    }
  }
  private static boolean isPrime(int n){
    if(n == 1 || n == 0){
      return true;
    }
    for(int i = 2; i < n/2; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }
}
