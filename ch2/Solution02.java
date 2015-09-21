/**
 * The method finds the Kth element from the last of a LinkedList
 * Time Complexity : 0(N) and Space Complexity : 0(1)
 * @author Anudeep
 *
 */
public class Solution02 {

	public static void findKthToLast(LinkedList lst,int n) {
		
		ListNode slow = lst.head;
		ListNode fast = lst.head;
		int length =0;
		
		while( slow.next != null){
			slow = slow.next;
			length++;
		}
		
		int kth = length - n;
		
		while(kth >= 0){
			fast = fast.next;
			kth--;
		}
		System.out.println(n+"th element from last = "+fast.val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst = new LinkedList();
		lst.AddLinks(1);
		lst.AddLinks(2);
		lst.AddLinks(3);
		lst.AddLinks(4);
		lst.AddLinks(5);
		findKthToLast(lst,2);
	}
}
