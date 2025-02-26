/*
There are n houses built in a line, each of which contains some value in it.

A thief is going to steal the maximal value of these houses, 
but he can’t steal in two adjacent houses because the owner of the stolen 
houses will tell his two neighbours left and right side.

What is the maximum stolen value?

Input Format

First an integer n, denoting how many houses are there.
Then n space separated integers denoting the values for the n houses.


Output Format

An integer denoting the maximum value possible to steal.

Input                                          

7                                               

6 7 1 3 8 2 5

Output

20

Explanation

6+1+8+5 = 20.

It is the max possible value.

*/


public class MaxStealValue {
  public static void main(String[] args) {
    int n = 7;
    int[] arr = {6,7,1,3,8,2,5};
    int sum = 0;
    for(int i = 0; i < n; i+=2){
      sum += arr[i];
    }
    System.out.println(sum);
  }
}
