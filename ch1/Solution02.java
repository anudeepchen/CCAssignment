import java.util.Arrays;

/**
 * Below function checks if one string is a permutation of the other
 * 
 * Time Complexity : O(nlog(n)) and Space complexity : O(1) 
 * @author Anudeep
 *
 */
public class Solution02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "dude the";
		String s2 = "dthd uee";
		
		if(s1.length() != s2.length()){
			System.out.println("Not a palindrome");
		}
		else{
			char [] c1 = s1.toCharArray();
			char [] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i = 0; i < s1.length();++i){
			if(c1[i] != c2[i])
				System.out.println("Not a palindrome");
		}
	  }
	System.out.println("Is a palindrome");
	}

}
