
/**
 * Below method sorts an array of strings so that all the anagrams are next to each other
 */

import java.util.Arrays;
import java.util.Comparator;


public class Solution02 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] anag = {"are","the","rea","het","ab","ear"};
	
	
	Arrays.sort(anag,new stringComp());
	
	for(int i = 0; i < anag.length; i++){
		System.out.println(anag[i]);
	}
	}
}

class stringComp implements Comparator<String>{
	
	public String sort(String s)
	{
	char [] ch = s.toCharArray();
	Arrays.sort(ch);
	return new String(ch);
	}
	@Override
	public int compare(String s1, String s2) {
		return sort(s1).compareTo(sort(s2));
	}
	
}
 