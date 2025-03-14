package SomeMorePYQs;

import java.util.Scanner;

public class MultiplesOf10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i = 1; i <= n*10; i++){
            if(i % 10 == 0){
                sum += i;
            }
        }
        System.out.println("Sum of first " + n + " multiples of 10 is: " + sum);
    }
}
