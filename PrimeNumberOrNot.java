public class PrimeNumberOrNot {
  public static void main(String[] args) {
    int n = 237;

    // if(x(n)){
    //   System.out.println(n+ " is a prime number");
    // } else {
    //   System.out.println("Not a prime number");
    // }
    if(recursionPrime(n, 2)){
      System.out.println(n+ " is a prime number");
    } else {
      System.out.println("Not a prime number");
    }
  }

  private static boolean x(int n){
    if(n == 1 || n == 0){
      return true;
    }
    for(int i = 2; i <= n/2; i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }

  // recursion approach
  private static boolean recursionPrime(int n, int div){
    if(n <= 1){
      return false;
    }

    if(div > Math.sqrt(n)){
      return true;
    }

    if(div % n == 0){
      return false;
    }
    return recursionPrime(n, div+1);
  }
}
