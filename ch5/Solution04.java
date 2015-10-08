/**
 * Below function prints the previous and next number of the input number
 * @author Anudeep
 *
 */

public class Solution04 {
	public static void main(String[] args) {

		int m = 13948;
		System.out.println("previous" + prevNum(m));
		System.out.println(m);
		int c = m;
		int maskOnes = ~0;
		int findp = 0;
		int ones = 0;
		int zeroes = 0;
		while (((c & 1) == 0) && (c != 0)) {
			zeroes++;
			c >>= 1;
		}
		findp = zeroes;
		while ((c & 1) != 0) {
			ones++;
			c >>= 1;
		}
		findp += ones;
		if (findp == 31 || findp == 0) {
			System.out.println("-1");
		}
		m |= (1 << findp);
		m = m & (maskOnes << findp);
		m = m | (1 << (ones-1)) - 1;
		System.out.println(m);
	}

	public static int prevNum(int m) {

		int c = m;

		int zeroes = 0;
		int ones = 0;

		while ((c & 1) == 1) {
			ones++;
			c >>= 1;
		}

		if (c == 0)
			return 1;

		while (((c & 1) == 0) && (c != 0)) {
			zeroes++;
			c >>= 1;
		}

		int p = zeroes + ones;

		m &= ((~0) << (p + 1));

		int mask = (1 << (ones + 1)) - 1;

		m |= mask << (zeroes - 1);
		return m;

	}

}
