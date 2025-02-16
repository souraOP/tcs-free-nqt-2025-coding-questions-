import java.util.*;

public class AdjacentDigitSum_codeforces {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0){
      int x= sc.nextInt(), y = sc.nextInt();
      if(solve(x, y)){
        System.out.println("Yes");
      } else{
        System.out.println("No");
      }
    }
    sc.close();
  }

  private static boolean solve(int x, int y){
    if(y == x + 1) {
      return true;
    }

    int diff= x - y + 1;
    if(diff > 0 && diff % 9==0){
      return true;
    }
    return false;
  }
}