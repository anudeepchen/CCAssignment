/**
 * Below Function peforms Ninety degree rotation of matrix
 * Complexity - O(M*N) where M and N are the rows and columns of the matrix
 * @author Anudeep
 *
 */
public class Solution07 {

	private static void transpose(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[0].length; j++) {
                int x = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = x;
            }
        }
    }

    public static void rotateByNinety(int[][] mat) {
        transpose(mat);
        for (int  i = 0; i < mat.length/2; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[mat.length -1 -i][j]; 
                mat[mat.length -1 -i][j] = temp;
            }
        }
        for (int  i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
	public static void main(String[] args) {
		int[][] mat = new int[][] {{1,0,0,1},
									{0,1,0,1},
									{1,2,1,0},
									{4,3,0,1}};		
		rotateByNinety(mat);
		
		}
	}

