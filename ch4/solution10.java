/**
 * Below function checks if one tree is a subtree of other 
 * @author Anudeep
 *
 */
public class solution10 {
	
	public static boolean hasTree(Node t1, Node t2){
		if(t2 == null)
		return true;
		
		return subTree(t1,t2);
		
	}

	public static boolean subTree(Node t1, Node t2){
		if(t1 == null)
			return false;
			else if(t1.data == t2.data && checkTree(t1,t2)){
				return true;
			}
		return subTree(t1.leftChild, t2)||subTree(t1.rightChild, t2);
	
	}
	
	public static boolean checkTree(Node t1,Node t2){
		if(t2== null && t1 == null)
			return true;
		else if(t2 ==null || t1 == null)
			return false;
		else if(t1.data != t2.data)
			return false;
		else return checkTree(t1.leftChild, t2.leftChild) && checkTree(t1.rightChild, t2.rightChild);
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
		
		
		Tree x = new Tree();
		x.insert(5, 5);
		x.insert(4, 4);
		x.insert(6, 6);
		
		boolean var = hasTree(t.root,x.root);
		
		if(var){
			System.out.println("x is a subtree of t");
		}
		else System.out.println("x is a not subtree of t");
	}

}
