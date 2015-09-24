/**
 * Below functions convert the a array to Binary search tree
 * 
 * Time Complexity : O(N)
 * @author Anudeep
 *
 */
class Node {

	int iData;
	int data;
	Node leftChild;
	Node rightChild;

	Node() {
	}

	Node(int key, int d) {
		iData = key;
		data = d;
	}

	public void display() {

		System.out.println(data);
	}

}

class Tree {

	public Node root;

	void insert(int key, int data) {

		Node newNode = new Node(key, data);

		String s = "";
		s.equals(null);
		// Node current = root;

		if (root == null) {
			root = newNode;
			System.out.println("Root = " + root.iData);
		} else {
			Node current = root;
			Node parent;
			while (current != null) {
				parent = current;
				if (current.iData > newNode.iData) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						System.out.println("Left side = "
								+ parent.leftChild.iData);
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						System.out.println("Right side = "
								+ parent.rightChild.iData);
						// return;
					}
				}
			}

		}
	}
	

}


public class Solution02 {
	
	public static Node sortedArrayToBST(int[] num) {
        if( num.length == 0)
            return null;
        return bst(num, 0, num.length-1);
    }

   static Node bst(int[] num, int first, int last )
  {
    if(first > last){return null;}

    int mid = (first+last)/2;
    Node node = new Node(num[mid],num[mid]);
    node.leftChild = bst(num,first, mid -1);
    node.rightChild = bst(num, mid+1, last);
    return node;
      
  }    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = { 1, 2, 3, 4, 5, 6 };
		sortedArrayToBST(num);
	}
}
