
/**
 * Below method search for an item in rotated Array using Binary search
 * @author Anudeep
 *
 */

public class Solution03 {

	public static void main(String[] args) {
		
		int[] A = { 15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14 };
		int find = 5;

		System.out.println(binSearch(A, 0, A.length - 1, find));
	}
	public static int binSearch(int[] A, int left, int right, int find) {

		while (left < right) {
			int mid = (left + right) / 2;

			if (A[mid] == find)
				return mid;

			if (A[left] <= A[mid])
				if (A[left] <= find && A[mid] > find) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			else {
				if (A[right] >= find && A[mid] < find) {
					left = mid + 1;
				} else
					right = mid - 1;
			}
		}
		return -1;
	}
}
