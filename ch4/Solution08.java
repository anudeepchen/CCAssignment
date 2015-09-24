

/**
 * Below functions finds the lowest common ancestor of the input nodes.
 * 
 * Time Complexity : O(log N) and Space Complexity : O(1)
 * @author Anudeep
 *
 */
public class Solution08 {
	
	static Node findLowestCommonAncestor(Node root, int value1, int value2) {
		while (root != null) {
			int value = root.data;
			if (value > value1 && value > value2) {
				root = root.leftChild;
			} else if (value < value1 && value < value2) {
				root = root.rightChild;
			} else {
				return root;
			}
		}
		return null; // only if empty tree
	}

	Node findLowestCommonAncestor(Node root, Node child1, Node child2) {
		if (root == null || child1 == null || child2 == null) {
			return null;
		}
		return findLowestCommonAncestor(root, child1.data, child2.data);
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
		
		System.out.println("Lowest Common Ancestor = "+ findLowestCommonAncestor(t.root, 12, 4).data);
	}
}
