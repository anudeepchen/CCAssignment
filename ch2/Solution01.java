
/**
 *  The method removes the duplicate values from the LinkedList using Hashtable
 * Time Complexity : 0(N) and Space Complexity : 0(N)
 * @author Anudeep
 */

import java.util.Hashtable;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	public void displayLink() {

		System.out.println("{" + val + "}");
	}
}

class LinkedList {
	ListNode head = null;
		
	void AddLinks(int n) {

		ListNode addNew = new ListNode(n);
		
		  ListNode current = head; 
		 /* addNew.next = newNode; 
		  newNode = addNew;*/
		 

		if (head == null) {
			head = addNew;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = addNew;
		}

	}
	
	
	void display() {
		ListNode node = head;

		while ((node != null)) {
			node.displayLink();
			node = node.next;
		}
	}
}
public class Solution01 {

	public static void removeDupNode(LinkedList lst) {
		
		ListNode node = lst.head;
		ListNode prev = null;
		
		Hashtable hTable=new Hashtable();

		  while(node!=null){
		      if(hTable.containsKey(node.val)){
		          prev.next = node.next;
		      } else {
		    	  hTable.put(node.val, true);
		          prev = node;
		      }
		      node =node.next;
		  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst = new LinkedList();
		lst.AddLinks(1);
		lst.AddLinks(2);
		lst.AddLinks(1);
		System.out.println("Before removing duplicates");
		lst.display();
		removeDupNode(lst);
		System.out.println("After removing duplicates");
		lst.display();
	
	}

}
