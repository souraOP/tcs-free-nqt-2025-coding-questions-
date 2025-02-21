
/*
Aashay loves to go to WONDERLAND, an amusement park. They are offering students who can code well with some discount. Our task is to 
reduce the cost of ticket as low as possible.

They will give some k turns to remove the cost of one ticket where the cost of tickets are combined and given as string. Help Aashay in coding
as he is not good in programming and get a 50% discount for your ticket.

Constraints:
- 1 <= number of tickets <= 10^5
- 1 <= K <= number of tickets

Input Format for Custom Testing:
- The first line contains a string, Tickets, denoting the given cost of each ticket.
- The next line contains an integer, K, denoting the number of tickets that is to be removed.

Sample Cases:
- Sample Input 1
203
3

- Sample Output 1
0
 */

import java.util.Scanner;
import java.util.Stack;

public class LTI_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    int tickets = sc.nextInt();
    sc.close();
    System.out.println(solve(n, tickets));
  }

  static String solve(String costOfTicket, int t){
    Stack<Character> st = new Stack<>();
    for(char c: costOfTicket.toCharArray()){
      while(!st.isEmpty() && st.peek() > c){
        st.pop();
        t--;
      }
      st.push(c);
    }

    // if t > 0
    while(t > 0 && !st.isEmpty()){
      st.pop();
      t--;
    }

    StringBuilder sb = new StringBuilder();
    for(char c: st){
      sb.append(c);
    }

    // if zeroes at front
    while(sb.length() > 1 && sb.charAt(0) == '0'){
      sb.deleteCharAt(0);
    }
    if(sb.length() == 0){
      return "0";
    } 
    return sb.toString();
  }
}
