/*
Given speed and time as inputs, calculate and print the distance.

Testcase:
Input:
Speed: 60 km/h
Time: 3 hours

Output:
180 km

Explanation:
Distance is calculated using the formula Distance=Speed× Time
 */

import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int speed = sc.nextInt();
    // int time = sc.nextInt();
    String speed = sc.nextLine();
    String time = sc.nextLine();

    int s = Integer.parseInt(speed.replaceAll("[^0-9]", ""));
    int t= Integer.parseInt(time.replaceAll("[^0-9]", ""));

    
    sc.close();
    System.out.println(s * t + " Km");

  }
}
