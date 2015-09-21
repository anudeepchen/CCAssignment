
public class Solution01 {

	/**
	 * Below function implements checks if the string has unique characters
	 * Time complexity : O(N) and Space Complexity : O(1)
	 * @param args
	 * @return
	 */
public static boolean main(String[] args) {
	
	int[] characters = new int[256];
	
	String s = "The dude is cool";
		
	for(int i =0; i  < s.length(); ++i){
		if(characters[s.charAt(i)] >= 1)
			return false;
		else characters[s.charAt(i)]++;
	}
	return true;
}
}
