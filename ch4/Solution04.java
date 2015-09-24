/**
 * Below functions if the given input tree is balanced tree or not.
 * 
 * Time Complexity : O(N) and Space Complexity : O(1)
 * @author Anudeep
 *
 */


public class Solution04 {

	public static int getHeight(Node root){
		if (root == null) return 0; 
		 return Math.max(getHeight(root.leftChild),getHeight(root.rightChild)) + 1;
	}
	
	public static boolean isBalanced (Node root){
		if(root== null) return true;
		
		int height = getHeight(root.leftChild)- getHeight(root.rightChild);
		
		if(Math.abs(height)>1)
			return false;
		else return (isBalanced(root.leftChild) && isBalanced(root.rightChild));
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
		
		System.out.println("The Input Tree is " +isBalanced(t.root));
	}

}
