import java.util.Stack;

/**
 * The method checks if the input linkedlist is a palindrome are not
 * Time Complexity : 0(N) and Space Complexity : 0(N)
 * @author Anudeep
 *
 */
public class Solution06 {

	
	public static void Palindrome(LinkedList node) {

		ListNode newNode = node.head;
		ListNode fast = newNode;
		ListNode slow = newNode;
		Stack<Integer> s = new Stack<Integer>();
		int counter = 1;
		int length = 1;
		if (newNode == null || newNode.next == null) {
			System.out.println("Palindrome");
		}
		if (fast == null) {
			slow = slow.next;
		} else {
			while (fast.next != null) {
				s.push(slow.val);
				slow = slow.next;
				fast = fast.next.next;
				length++;
			}

			while (slow.next != null) {

				if (slow.next.val == s.pop()) {
					slow = slow.next;
					counter++;
				} else {
					break;
				}
			}

			if (length == counter) {
				System.out.println("Input Linkedlist is a Palindrome");
			} else {
				System.out.println("Not a Palindrome");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst = new LinkedList();
		lst.AddLinks(0);
		lst.AddLinks(1);
		lst.AddLinks(2);
		lst.AddLinks(1);
		lst.AddLinks(0);
		Palindrome(lst);
	}
}
