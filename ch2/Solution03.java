/**
 * The method finds the Kth element from the last of a LinkedList
 * Time Complexity : 0(N) and Space Complexity : 0(1)
 * @author Anudeep
 *
 */
public class Solution03 {

	public static void deleteMiddleNode(ListNode middle) {
		
		if(middle == null)
		 System.out.println("false");
		
		ListNode nextNode = middle.next;
		middle.val = nextNode.val;
		middle.next = nextNode.next;
		
		System.out.println(middle.val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst = new LinkedList();
		lst.AddLinks(1);
		lst.AddLinks(2);
		lst.AddLinks(3);
		lst.AddLinks(4);
		lst.AddLinks(5);
		deleteMiddleNode(lst.head.next.next);
	}
}
