import java.util.Random;


public class Solution11 {
	
	
	public static int getHeight(Node root){
		if (root == null) return 0;
		 return Math.max(getHeight(root.leftChild),getHeight(root.rightChild)) + 1;
	}
	
	public static Node randomNode(Node root){
		Random r = new Random();
		int i = r.nextInt(getHeight(root));
		
		if(i <= getHeight(root.leftChild))
			return randomNode(root.leftChild);
		else return randomNode(root.rightChild);
	}
	
	public static void main(String[] args) {
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
	System.out.println(randomNode(t.root).data);
	
	}

}
