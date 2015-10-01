/**
 * Given a sorted array of strings with spaces the method returns the location of a given string
 * @author Anudeep
 *
 */


public class Solution05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] st = { "ab", "", "", "", "bc", "", "cd", "", "", "ef" };

		String find = "bc";

		System.out.println(sortString(st, 0, st.length-1, find));
	}

	private static int sortString(String[] st, int left, int right, String find) {

		int mid = (left + right) / 2;

		if (st[mid].equals("")) {
			int first = mid - 1;
			int last = mid + 1;

			while (true) {
				if (left > first && right > last)
					return -1;
				if (!st[right].isEmpty() && right <= last) {
					mid = right;
					break;
				} else if (!st[left].isEmpty() && left >= first) {
					mid = left;
					break;
				}
				first--;
				last++;
			}
		}

		if (st[mid].equals(find)) {
			return 1;
		} else if (st[mid].compareTo(find) > 0)
			return sortString(st, left, mid + 1, find);
		else
			return sortString(st, mid - 1, right, find);
	}
}