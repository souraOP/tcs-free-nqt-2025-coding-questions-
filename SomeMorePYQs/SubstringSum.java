package SomeMorePYQs;

public class SubstringSum {
    public static void main(String[] args) {
        int n = 3;
        String str = "201";
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += str.charAt(j) - '0';
                if(sum != j-i+1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
