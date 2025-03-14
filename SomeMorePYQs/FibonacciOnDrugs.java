package SomeMorePYQs;

/*
Question:

John has discovered a magical tree, where each new branch grows following a unique pattern.
Unlike the traditional Fibonacci sequence, the number of branches at each stage follows this
rule:

- Stage 1: 1 branch
- Stage 2: 2 branches
- From Stage 3 onwards: The branches at each stage are the product of the previous two stages multiplied by 2.

John wants to know the total number of branches that will exist after N stages. Can you help him calculate it?

Formula:

F(N) = F(N-1) x F(N-2) x 2
F(1) = 1, F(2) = 2


Example 1:

Input: N=5

Stages of growth: 1, 2, 4, 16, 128

Total branches: 1 + 2 + 4 + 16 + 128 = 151

Output: Total branches after stage 5: 151

*/


import java.util.Scanner;

public class FibonacciOnDrugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long ans = fiboOnDrugs(n);
        System.out.println("Total branches after stage " + n + " is: " + ans);
    }

    /*
    Calculates the total number of branches after N stages
    @param n is the number of stages
    @return the total branches
     */
    static long fiboOnDrugs(int n) {
        if(n <= 0) {
            return 0;
        }
        if(n == 1) {
            return 1;

        }
        if(n == 2) {
            return 3;
        }
        long[] branches = new long[n+1];
        branches[1] = 1;
        branches[2] = 2;
        long total = branches[1] + branches[2];
        for(int i = 3; i <= n; i++) {
            branches[i] = branches[i-1] * branches[i-2] * 2;
            total+=branches[i];
        }
        return total;
    }
}
