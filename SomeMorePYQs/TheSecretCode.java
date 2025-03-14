package SomeMorePYQs;

import java.util.Scanner;

public class TheSecretCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n >= 100 && n <= 999) {
            if(isSecretCode(n)){
                System.out.println("Yes");
                System.out.println("(The treasure gate opens!)");
            } else {
                System.out.println("No");
                System.out.println("(The gate remains locked!)");
            }
        } else {
            System.out.println("No");
            System.out.println("(The gate remains locked!)");
        }
        
    }

    static boolean isSecretCode(int n) {
        if(n % 9 == 0){
            return true;
        }
        return false;
    }
}
