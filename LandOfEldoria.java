import java.util.*;

public class LandOfEldoria{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k = sc.nextInt();
		
		sc.close();
		System.out.println(getSequence(str, k));
	}

	static boolean getSequence(String str, int k){
		if(str.length() < k) return false;
		int count = 1;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
			} else {
				if(count == k){
					return true;
				}
				count = 1;
			}
		}

		return k == count;
	}
}