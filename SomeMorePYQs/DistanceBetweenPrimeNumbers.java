package SomeMorePYQs;

import java.util.*;

public class DistanceBetweenPrimeNumbers {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // best case
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // sc.close();

        // worst case
        // if input is in strings
        String line = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        for(char ch: line.toCharArray()){
            // if the character is a digit
            if(Character.isDigit(ch)){
                sb.append(ch);
            } else if(sb.length() > 0){
                arr.add(Integer.parseInt(sb.toString()));
                sb.setLength(0);
            }
        }

        // any remaining shit
        if(sb.length() > 0){
            arr.add(Integer.parseInt(sb.toString()));
        }
        int[] list = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            list[i] = arr.get(i);
        }
        // for(int i : list){
        //     System.out.print(i + " ");
        // }

        System.out.println(getMaxDistance(list));
    }

    static int getMaxDistance(int[] arr){
        int firstPrime = -1, lastPrime= -1;
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                if(firstPrime == -1){
                    firstPrime = i;
                }
                lastPrime = i;
            }
            // if prime number is not found
            if(firstPrime == -1 || firstPrime == lastPrime){
                return 0;
            }
        }
        return Math.abs(lastPrime - firstPrime);
    }

    static boolean isPrime(int i){
        if(i <= 1){
            return false;
        }
        for(int j = 2; j < i/2; j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
