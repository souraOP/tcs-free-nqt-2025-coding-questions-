package SomeMorePYQs;

import java.util.*;

public class ReplaceArrayWIthRank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] temp = arr.clone();
        // for(int j = 0; j < temp.length; j++){
        //     System.out.print(temp[j] + " ");
        // }
        // System.out.println();
        Arrays.sort(temp);
        HashMap<Integer, Integer> mp = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < temp.length; i++){
            if(!mp.containsKey(temp[i])){
                mp.put(temp[i], rank);
                rank++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = mp.get(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
}
