package SomeMorePYQs;

// https://leetcode.com/problems/count-operations-to-obtain-zero/description/?envType=problem-list-v2&envId=math

import java.util.Scanner;

public class BattleOfTwoWarriors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        sc.close();
        countAttacks(n1, n2);
    }

    static void countAttacks(int n1, int n2) {
        int totalAttacks = 0;
        while(n1 > 0 && n2 > 0) {
            if(n1 >= n2) {
                n1 = n1 - n2;
            } else if(n1 < n2){
                n2 = n2 - n1;
            }
            totalAttacks++;
        }
        if(n1 == 0){
            System.out.println("Winner: Duar (num2 = " + n2 + ")");
        } else if(n2 == 0){
            System.out.println("Winnder: Numar (num1 = " + n1 + ")");
        }
        System.out.println("Total Attacks: " + totalAttacks);
        

    }
}
