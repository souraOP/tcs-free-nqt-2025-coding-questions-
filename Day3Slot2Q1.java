import java.util.*;

/*
A furnishing company is manufacturing a new collection of curtains. The curtains are of two colors aqua(a) and black (b). 
The curtains color is represented as a string(str) consisting of a’s and b’s of length N. Then, they are packed (substring) 
into L number of curtains in each box. The box with the maximum number of ‘aqua’ (a) color curtains is labeled. 
The task here is to find the number of ‘aqua’ color curtains in the labeled box.

Note :

If ‘L’ is not a multiple of N, the remaining number of curtains should be considered as a substring too. 
In simple words, after dividing the curtains in sets of ‘L’, any curtains left will be another set(refer example 1)

Example 1:

Input :

bbbaaababa -> Value of str

3    -> Value of L

Output:

3   -> Maximum number of a’s

Explanation:

From the input given above.

Dividing the string into sets of 3 characters each 

Set 1: {b,b,b}

Set 2: {a,a,a}

Set 3: {b,a,b}

Set 4: {a} -> leftover characters also as taken as another set

Among all the sets, Set 2 has more number of a’s. The number of a’s in set 2 is 3.

Hence, the output is 3.

Example 2:

Input :

abbbaabbb -> Value of str

5   -> Value of L

Output:

2   -> Maximum number of a’s

Explanation:

From the input given above,

Dividing the string into sets of 5 characters each.

Set 1: {a,b,b,b,b}

Set 2: {a,a,b,b,b}

Among both the sets, set 2 has more number of a’s. The number of a’s in set 2 is 2.

Hence, the output is 2.

Constraints:

1<=L<=10

1<=N<=50

The input format for testing 

The candidate has to write the code to accept two inputs separated by a new line.

First input- Accept string that contains character a and b only

Second input- Accept value for N(Positive integer number)

The output format for testing

The output should be a positive integer number of print the message(if any) 
given in the problem statement.(Check the output in Example 1, Example 2).
*/

public class Day3Slot2Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int L = sc.nextInt();
    int count = 0, max=0;

    for(int i = 0; i < str.length(); i++) {
      if(i % L == 0) {
        max = Math.max(count, max);
        count=0;
      }
      if(str.charAt(i) == 'a')
        count++;
      

    }
    max=Math.max(max, count);
    System.out.println(max);



    sc.close();
  }
}