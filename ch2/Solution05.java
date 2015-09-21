/**
 * The method Adds two input linkedlists and displays the sum
 * Time Complexity : 0(N) and Space Complexity : 0(N)
 * @author Anudeep
 *
 */

public class Solution05 {

	public static void sumLists(LinkedList lst1,LinkedList lst2) {

		ListNode l1= lst1.head;
		ListNode l2 = lst2.head;
		 if (l1 == null)
	            lst2.display();
	            if (l2 == null)
	            lst1.display();
	            if (l1 == null && l2 == null)
	            System.out.println("Input is null");
	            ListNode dummy = new ListNode(0);
	            ListNode sum = dummy;
	            int carry = 0;
	            
	            while(l1 != null || l2 != null){
	                int x = (l1 != null) ? l1.val : 0;
	                int y = (l2 != null) ? l2.val : 0;
	                int sum1 = x+y+carry;
	                carry = sum1 / 10;
	                sum.next = new ListNode(sum1 % 10);
	                sum = sum.next;
	                if(l1 != null) l1 = l1.next;
	                if(l2 != null) l2 = l2.next;
	            }
	    if(carry>0){
	        sum.next = new ListNode(carry);
	    }
	    ListNode node = dummy.next;

		while ((node != null)) {
			node.displayLink();
			node = node.next;
		}
	}
	public static ListNode reverse(ListNode newNode) {

		ListNode currentNode = newNode;
		ListNode previousNode = null;
		ListNode nextNode = null;

		while (currentNode != null) {

			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
	
	public static void followUp(LinkedList lst1,LinkedList lst2) {

		ListNode a= lst1.head;
		ListNode b = lst2.head;
		
	ListNode l1 = reverse(a);
	ListNode l2 = reverse(b);
		if (l1 == null)
	            lst2.display();
	            if (l2 == null)
	            lst1.display();
	            if (l1 == null && l2 == null)
	            System.out.println("Input is null");
	            ListNode dummy = new ListNode(0);
	            ListNode sum = dummy;
	            int carry = 0;
	            
	            while(l1 != null || l2 != null){
	                int x = (l1 != null) ? l1.val : 0;
	                int y = (l2 != null) ? l2.val : 0;
	                int sum1 = x+y+carry;
	                carry = sum1 / 10;
	                sum.next = new ListNode(sum1 % 10);
	                sum = sum.next;
	                if(l1 != null) l1 = l1.next;
	                if(l2 != null) l2 = l2.next;
	            }
	    if(carry>0){
	        sum.next = new ListNode(carry);
	    }
	    ListNode node = reverse(dummy.next);

		while ((node != null)) {
			node.displayLink();
			node = node.next;
		}
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst1 = new LinkedList();
		lst1.AddLinks(7);
		lst1.AddLinks(1);
		lst1.AddLinks(6);
		
		LinkedList lst2 = new LinkedList();
		lst2.AddLinks(5);
		lst2.AddLinks(9);
		lst2.AddLinks(2);
		
		System.out.println("Sum of the two linkedlists :");
		sumLists(lst1,lst2);
		
		LinkedList lst3 = new LinkedList();
		lst3.AddLinks(6);
		lst3.AddLinks(1);
		lst3.AddLinks(7);
		
		LinkedList lst4 = new LinkedList();
		lst4.AddLinks(2);
		lst4.AddLinks(9);
		lst4.AddLinks(5);
		System.out.println("Sum of the two reversed linkedlists :");
		followUp(lst3,lst4);
	}
}
