/**
 * Below function Checks if the input string is a permutation palindrome
 * Time Complexity : O(N)
 * Author: Anudeep
 */


import java.util.ArrayList;

public class Solution04 {

	public static void main(String[] args) {
		
		String s1 = "ababcd";
		String s = s1.toLowerCase();
		int[] c = new int[256];
		ArrayList<Character> ch = new ArrayList<Character>();
		
		for(int i = 0; i < s.length();++i){
			if(Character.isAlphabetic(s.charAt(i)))
			ch.add(s.charAt(i));
		}
      
		for(int i =0 ; i < ch.size();++i){
			if(c[ch.get(i)] == 0) c[ch.get(i)]++;
			else  c[ch.get(i)]--;
		}
	int sum = 0;	
	for(int i = 0; i < c.length;++i){
		sum = sum + c[i];
	}
	System.out.println(sum);
	if(ch.size() % 2 == 0 && sum == 0)
		System.out.println("palindrome");
	if(ch.size() % 2 != 0 && sum == 1)
		System.out.println("palindrome");
	else System.out.println("not palindrome");
	
	}

}
