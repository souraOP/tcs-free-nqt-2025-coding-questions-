/*
In the mystical land of Eldoria, ancient wizards communicate using enchanted scrolls. Each scroll contains a sequence of magical
symbols (represented as lowercase English letters), but only a few of these sequences hold true magical power.
The Council of Wizards has given you a special task:
🔮 Find a Magical Sequence 🔮
A sequence is considered magical if:
1.
It consists of exactly K repeated symbols (e.g.,
"aaa" or "bbb").
2.
The symbol before this sequence (if any) must be different from the repeating symbol.
3.
The symbol after this sequence (if any) must also be different from the repeating symbol.
The wizard elders need to know if such a sequence exists in a given scroll. If it does, return True; otherwise, return False.
Example 1
📜 Input:
s = "aaabaaa"
, k = 3
🔍 Output:
True
💡 Explanation:
The substring "aaa" (at positions 4 to 6) meets all the conditions:
It has exactly 3 repeated characters.
The previous character is 'b'
, which is different from 'a'
.
There is no character after this "aaa"
, which is allowed.
Example 2
📜 Input:
s = "abc"
, k = 2
🔍 Output:
False
💡 Explanation:
There is no substring of length 2 where all characters are the same and surrounded by different characters.

*/


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