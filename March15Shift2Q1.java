import java.util.*;

// problem statement: get the unique element from an array containing duplicates

/*
Example 1: 

Input: n = 6
       arr = 4, 2, 1, 4, 2, 3, 3

Output: 1

Explanation: 1 only occurs one time, rest other elements contains duplicates
 */

public class March15Shift2Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int res = findUnique(arr, n);
        System.out.println(res);
        
    }
    static int findUnique(int[] arr, int n){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        // for(int num: arr){
        //     if(mp.get(num) == 1){
        //         System.out.println(num);
        //         break;
        //     } 
        // }


        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }

}
