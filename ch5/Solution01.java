/**
 * Below function inserts the number m into number n using bit manipulations
 * @author Anudeep
 *
 */
public class Solution01 {

	public static void main(String[] args) {
		int n = 128; //10000000
		int m = 11;// 1011
		int j = 4;
		int i = 1;
		int mask = 0;
		int ones = ~0;
		int jzeroes = 0;
		
		int izeroes = 0;
		
		jzeroes = ones << (i+j); // 
		izeroes = (1 << i)-1 ;
		
		System.out.println(jzeroes);
		mask = jzeroes | izeroes;
		
		int n_masked = n & mask;
		
		int m_shift = m << i;
		System.out.println(n_masked | m_shift);
		
	}
}
