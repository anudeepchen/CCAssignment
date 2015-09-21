/**
 * Below function replaces the entire rows and columns of matrix with zeroes 
 * if the any of the rows or columns has zero in it
 * 
 * Time complexity : O[m*n] and Space complexity : O[m*n]
 * @author Anudeep
 *
 */
public class Solution08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = new int[][] {{1,0,0,1},
				{0,1,0,1},
				{1,2,1,0},
				{4,3,0,1}};
		
	
		boolean[] rows = new boolean[mat.length];
		boolean[] columns = new boolean[mat[0].length];
		
		for(int i = 0; i < mat.length-1;++i){
			for(int j=0; j < mat[0].length-1;++j){
				
				if(mat[i][j]==0){
					rows[i] = true;
					columns[j] = true;
				}
			}
		}
	
		for(int i = 0; i < mat.length-1;++i){
			for(int j=0; j < mat[0].length-1;++j){
				if(rows[i]||columns[j]){
					mat[i][j] = 0;
				}
			}
			}
	
	}

}
