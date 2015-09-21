/**
 * Below functions replaces all spaces in the string with '%20'.
 * Time complexity : O(N) 
 * @author Anudeep
 *
 */
public class Solution03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Mr John Smith   ";
		int len = 13;
		int spaces = 0;
		char[] st = new char[100];
		
		for(int i = 0;i< s.length();i++){
			st[i] = s.charAt(i);
		}
		
		for(int i=0; i < 13; i++ ){
			if(st[i] == ' ')
				spaces++;
		}
		
		int newLen = len+(spaces*2);
		for(int i = len-1;i >=0; i--){
			if(st[i] == ' '){
				st[newLen-1] = '%';
				st[newLen-2] = '2';
				st[newLen-3] = '0';
				newLen = newLen - 3;
			}
			else {st[newLen-1] = st[i];
					newLen= newLen-1;
					}
		}
	
System.out.println(new String(st));
	}
}