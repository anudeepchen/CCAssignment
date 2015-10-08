
/**
 * 
 * @author Anudeep
 * n & (n-1) == 0 . When we do logical 'AND' of two numbers and if the result is zero. 
 * it indicates that two numbers never share 1
 * 
 * in case of 'n-1' we consider LSB. If it's a 1 we should change it to 0. If it is zero then we 
 * borrow from a larger bit.
 * 
 * so if n = 1000
 * then n-1 = 0111
 * 
 * so when we AND these two numbers the result will be zero . So the value of n is a power of two
 * so ((n & (n-1)) == 0) checks if n is power of 2
 */
public class Solution05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
