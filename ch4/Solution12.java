/**
 * Below function finds all the paths in a tree that leads to the given input sum
 * 
 * Time Complexity :O(N Log(N))
 * @author Anudeep
 *
 */
public class Solution12 {
	
	
	public static int countPaths(Node root, int sum){
		if(root == null) return 0;
		
		int  pathRoot = sumFromNode(root,sum,0);
		
		int pathLeft = countPaths(root.leftChild,sum);
		int pathRight = countPaths(root.rightChild,sum);
		
		return pathRoot+pathLeft+pathRight;
	}

	public static int sumFromNode(Node root, int sum, int currentSum){
		if(root == null) return 0;
		int paths = 0;
		currentSum = currentSum + root.data;
		
		if(currentSum == sum)
			paths++;
		
		paths = paths + sumFromNode(root.leftChild,sum,currentSum);
		paths = paths + sumFromNode(root.rightChild,sum,currentSum);
		return paths;
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
		
		System.out.println("Total Number of paths leading to the sum = "+countPaths(t.root,15));
	}

}
