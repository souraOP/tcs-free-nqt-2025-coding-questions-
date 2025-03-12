/*
Deep within the ancient ruins of Harmonia, a legendary kingdom known for its perfect balance, archaeologists have discovered a collection of mystical number scrolls. The scrolls, believed
to be over a thousand years old, contain sequences of numbers that hold a long-lost secret. The ancient texts reveal that only sequences with a perfect harmony can unlock the wisdom of
Harmonia. But what is a harmonious sequence? The Mystery of Harmonia A sequence is considered harmonious if it follows the sacred rule of the kingdom:
The highest and lowest numbers in the sequence must have a difference of exactly 1.
The sequence must be formed by selecting numbers from the scroll (in any order, without breaking their values).
Among all such possible sequences, only the longest one is believed to contain the true knowledge of Harmonia.
The Royal Scholars have given you a mission:
🔮 Find the longest harmonious sequence hidden within the scroll! 🔮
Example Discoveries
Discovery 1
📜 Decoded Scroll:
[1,3,2,2,5,2,3,7]
🔍 Longest Harmonious Sequence Found:
[3,2,2,2,3] → Length: 5
💡 Explanation:
The highest number is 3 and the lowest is 2.
The difference is exactly 1.
No other selection gives a longer sequence.
Discovery 2
📜 Decoded Scroll:
[1,2,3,4]
🔍 Longest Harmonious Sequence Found:
[1,2] or [2,3] or [3,4] → Length: 2
💡 Explanation:
Multiple valid sequences exist, each with a length of 2.
Discovery 3
📜 Decoded Scroll:
[5,5,5,5]
🔍 Longest Harmonious Sequence Found:
None → Length: 0
💡 Explanation:
All numbers are the same, so no valid sequence exists.
Your Mission
🔹 Write a function from scratch to decode the scrolls and find the longest harmonious sequence.
🔹 Ensure the function works efficiently, as some scrolls contain thousands of numbers.
🔹 The fate of Harmonia's lost knowledge depends on your ability to crack the pattern!
*/


import java.util.*;

public class RuinsOfHarmonia{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> arr = new ArrayList<>();
		for(char i: str.toCharArray()){
			if(Character.isDigit(i)){
				sb.append(i);
			} else if (sb.length() > 0){
				arr.add(Integer.parseInt(sb.toString()));
				sb.setLength(0);
			}
		}

		// remaining
		if(sb.length() > 0){
			arr.add(Integer.parseInt(sb.toString()));
		}
		int[] ans = new int[arr.size()];
		for(int i = 0; i < arr.size(); i++){
			ans[i] = arr.get(i);
		}
		System.out.println(solve(ans));
	}

	static int solve(int[] arr){
		if(arr.length == 0 || arr == null) {
			return 0;
		}

		Arrays.sort(arr);
		int left =0, right = 1;
		int ans = 0;
		while(right < arr.length){
			int diff = arr[right] - arr[left];
			if(diff == 1){
				ans = Math.max(ans, right - left + 1);
			}

			if(diff <= 1) {
				right++;
			} else {
				left++;
			}
		}
		return ans;
		
	}
}