/**
 * Below function swaps odd and even bits in a integer with a few instructions
 * @author Anudeep
 *
 */
public class Solution07 {

	public static void main(String[] args) {
		 
		int x = 9;
		
		int even = x & 0xAAAAAAAA; // odd Bits
		     int odd = x & 0x55555555; // Even bits
		 
		    even >>= 1;  
		    odd <<= 1;   
		 
		    int fin = even|odd;
		    System.out.println(fin);
	}
}
