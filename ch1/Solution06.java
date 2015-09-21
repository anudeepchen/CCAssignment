
/**
 * Below method performs basic string compression and displays compressed strings or original which
 * ever is smaller
 * time complexity  : O(N) 
 * @author Anudeep
 *
 */
public class Solution06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "aabccccaaa";
      StringBuffer sb = new StringBuffer();
      
      int count = 1;
      
      for (int i = 1; i < s.length(); ++i){
    	  if(s.charAt(i) == s.charAt(i-1)){
    		  count++;
    	  }
    	  else {
    		  sb.append(s.charAt(i-1));
    		  sb.append(count);
    		  count = 1;
    	  }
      }
      sb.append(s.charAt(s.length()-1));
      sb.append(count);
	
      if(sb.length() > s.length()){
    	  System.out.println(s);	  
      }
      else System.out.println(sb);
	}

}
