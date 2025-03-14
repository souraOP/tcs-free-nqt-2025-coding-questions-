package SomeMorePYQs;

import java.util.HashSet;
import java.util.Scanner;

public class FindMissingCharacterSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sc.close();
        sentence.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(char ch: sentence.toCharArray()){
            if(Character.isLetter(ch)){
                set.add(ch);
            }
        }
        //for storing the result
        StringBuilder res = new StringBuilder();
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(!set.contains(ch)){
                res.append(ch);
            }
        }
        if(res.length() == 0){
            System.out.println(0);
        } else {
            System.out.println(res.toString());
        }
    }
}
