/**
 * Below function validates if the given tree is valid Binary search tree or not.
 * 
 * Time Complexity : O(N) and Space Complexity : (1)
 * 
 * @author Anudeep
 *
 */


public class Solution05 {
	
	public static boolean isValidBst(Node root){
		
		if (root == null)
			return false;
	return valid(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
		
	}

	private static boolean valid(Node n, int maxValue, int minValue) {
		
		if (n == null)
			return true;
		
		if(n.data > maxValue || n.data < minValue)
		   return false;
		
		return valid(n.leftChild,n.data,minValue) && valid(n.rightChild,maxValue,n.data);
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree t = new Tree();
		t.insert(10, 10);
		t.insert(5, 5);
		t.insert(15, 15);
		t.insert(20, 20);
		t.insert(12, 12);
		t.insert(30, 30);
		t.insert(13, 13);
		t.insert(4, 4);
		t.insert(6, 6);
		
	System.out.println("Is Valid? : "+isValidBst(t.root));
	}
}
