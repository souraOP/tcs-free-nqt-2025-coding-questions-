package SomeMorePYQs;

/*
An integer number in base 10 which is divisible by the sum of its digits is said to be a Harshad Number. An n-Harshad number is an integer number divisible by the sum of its digit in base n.
Below are the first few Harshad Numbers represented in base 10:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………
Given a number in base 10, our task is to check if it is a Harshad Number or not.

Examples : 


Input: 3
Output: 3 is a Harshad Number


Input: 18
Output: 18 is a Harshad Number


Input: 15
Output: 15 is not a Harshad Number
 */

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        System.out.println(isHarshadNumber(n));
    }

    static boolean isHarshadNumber(int n){
        // we have to take the sum of the digits 
        // then check if the sum of digits is divisible by the actual number or not
        int sum = 0, org=n;
        while(org > 0){
            sum += org % 10;
            org = org / 10;
        }
        
        return (n % sum == 0);
    }
}
