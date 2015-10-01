
/**
 * Below function finds an element in a matrix
 * @author Anudeep
 *
 */



public class Solution09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 15, 20, 40, 85 }, { 20, 35, 80, 95 },
				{ 30, 55, 95, 105 }, { 40, 80, 100, 120 } };

		int elem = 55;
		int row = 0;
		int col = mat[0].length-1;

		while (row < mat.length-1 && col > 0) {

			if (mat[row][col] == elem) {
				System.out.println("found the elem");
				break;
			}
			else if (mat[row][col] > elem){
				col--;
			}
			else row++;
		}
	}
}
