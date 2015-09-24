import java.util.LinkedList;

/**
 * Below function creates a linked list of all the nodes in the tree
 * 
 * Time Complexity : O(N) and Space Complexity : O(N)
 * @author Anudeep
 *
 */


public class Solution03 {
	
	public static LinkedList<LinkedList<Integer>> lstNodes(Node root) {
       
		if(root == null)
			return null;
        
		LinkedList<LinkedList<Integer>> allNodes = new LinkedList<LinkedList<Integer>>();
		LinkedList<Integer> newNodes = new LinkedList<Integer>();
		
		LinkedList<Node> current = new LinkedList<Node>();
		LinkedList<Node> next = new LinkedList<Node>();
		
		current.add(root);
		
		while(!current.isEmpty()){
			Node node = current.remove();
			
			if(node.leftChild != null)
				next.add(node.leftChild);
			if(node.rightChild != null)
				next.add(node.rightChild);
			
			newNodes.add(node.data);
			
			if(current.isEmpty()){
				current = next;
				next = new LinkedList<Node>();
				allNodes.add(newNodes);
				newNodes = new LinkedList<Integer>();
			}
		}
		return allNodes;
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
		
		LinkedList<LinkedList<Integer>> result = lstNodes(t.root);
		
		System.out.println("LinkedLists for each depth of a tree");
		for(int i = 0; i < result.size();++i){
			System.out.println(result.get(i));
		}
		
	}
}
