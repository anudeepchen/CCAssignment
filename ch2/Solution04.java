/**
 * The method partitions a linkedList around a value x such that all nodes less than x comes 
 * before all nodes greater that or equal to x.
 * Time Complexity : 0(N) and Space Complexity : 0(N)
 * @author Anudeep
 *
 */
public class Solution04 {

	public static void partition(LinkedList lst,int n) {

		ListNode newNode = lst.head;
		
		ListNode before = null;
		ListNode after = null;

		while (newNode != null) {
			ListNode nNode = newNode.next;

			if (newNode.val <  n) {
				newNode.next = before;
				before = newNode;
			}
			else {
				newNode.next = after;
				after = newNode;
			}
			newNode = nNode;

		}

		if (before == null) {
			while ((after != null)) {
				after.displayLink();
				after = after.next;
			}
		}
		ListNode h = before;
		while (before.next != null) {
			before = before.next;
		}

		before.next = after;
		ListNode node = h;

		while ((node != null)) {
			node.displayLink();
			node = node.next;
		}
	} 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst = new LinkedList();
		lst.AddLinks(3);
		lst.AddLinks(8);
		lst.AddLinks(5);
		lst.AddLinks(10);
		lst.AddLinks(2);
		lst.AddLinks(1);
		partition(lst,5);
	}
}
