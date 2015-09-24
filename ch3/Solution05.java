/**
 * Below program sorts a stack in ascending order by using one more additional stack to hold items
 * Time Complexity : O(N) and Space Complexity : O(N)
 */

import java.util.Stack;

public class Solution05 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack unSortStk = new Stack();
		Stack sortStk = new Stack();
		
		
		sortStk.push(1);
		sortStk.push(3);
		sortStk.push(8);
		sortStk.push(12);
		
		unSortStk.push(7);
		unSortStk.push(10);
		unSortStk.push(5);

		int size = 0;
		
		while(!unSortStk.isEmpty()){
			int val = (int) unSortStk.pop();
			while (!sortStk.isEmpty() && (int)sortStk.peek() > val){
				int temp = (int) sortStk.pop();
				unSortStk.push(temp);
			}
		sortStk.push(val);
		}
	System.out.println(sortStk);	
	}

}
