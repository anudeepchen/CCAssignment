
/**
 * Below function checks if the S2 is a substring of S1
 * @author Anudeep
 *
 */
public class Solution09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		String s3 = s1+s1;
		if(s2.length() == s1.length()){
		return isSubString(s3,s2);
		}
		else {System.out.println("false");}
	}

}
