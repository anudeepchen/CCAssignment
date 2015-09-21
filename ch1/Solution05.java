
/**
 * 
 * @author Anudeep
 *
 *Below function checks if the input string is a permutation of a palindrome.
 *Time complexity: O(N) 
 */
public class Solution05 {

public static void main(String[] args) {
	
	String s1 = "pale";
	String s2 = "pbae";
	int j = 0;
	
	if(Math.abs(s1.length() - s2.length()) > 1){
		System.out.println("False");
	}
	
	int len = 0;
	
	while(len < s2.length() && s1.charAt(len) == s2.charAt(len))
	{
		len++;
	}

	if(len < s2.length()){
		j++;
	}

	while(len< s2.length() && s2.charAt(len) == s1.charAt(len+j)){
		len++;
	}

	if(len == s2.length())
		System.out.println("True");
	else System.out.println("false");

}
}
