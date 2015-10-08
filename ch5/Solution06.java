/**
 * below function returns number of flips are required to convert integer a to integer b
 * @author Anudeep
 *
 */
public class Solution06 {
	public static void main(String[] args) {
		int a = 29;
		int b = 15;
		
		int x = a^b;
		int count = 0;
		while(x>0){
			x = x >> 1;
			if((x & 1) != 0){
				count++;
			}
		}
	System.out.println(count);
	}
}
