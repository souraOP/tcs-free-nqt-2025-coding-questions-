/*
Print a Special Pyramid from an Input Array

Problem: Given a height h and an input array arr , print a special
pyramid where numbers less than 5 must be padded with zeroes.

Test Case:
Input: height = 3, arr = [6, 28, 66, 120, 190, 276]

Output:

00006
00028 00066
00120 00190 00276

*/

import java.util.Scanner;

public class SpecialPyramid_Strings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();
    int[] arr = {6, 28, 66, 120, 190, 276};
    sc.close();
    printPyramid(height, arr);

  }

  static void printPyramid(int h, int[] arr) {
    int index = 0;
    // int getMax = 0;
    // for(int i = 0; i < arr.length; i++) {
    //   if(arr[i] > getMax){
    //     getMax = arr[i];
    //   }
    // }

    // int width = Integer.toString(getMax).length();
    for(int row = 1; row <= h; row++) {
      for(int col = 1; col <= row; col++) {
        if(index < arr.length) {
          System.out.print(String.format("%05d", arr[index]));
          index++;
          if(col < row) {
            System.out.print( " ");
          }
        }
      }
      System.out.println();
    }
  }
}
