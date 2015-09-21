/**
 * Below method checks if the input LinkedList has a cycle or not
 * Time complexity : O(N) and Space Complexity : O(1)
 * @author Anudeep
 *
 */
public class Solution08 {

	 public static ListNode detectCycle(ListNode head) {
         if (head == null)
        return null;
        
        ListNode fast = head;
        ListNode slow = head;
        
        
        while( fast != null && fast.next != null)
        {
            fast = fast.next.next;
     
            slow = slow.next;
     
              if(fast == slow)
                  break;
        }

     if(fast == null || fast.next == null){
      return null;
    }

    slow = head;
    while(fast != slow)
    {
        slow = slow.next;
        fast = fast.next;
    }
    
    return fast;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst1 = new LinkedList();
		lst1.AddLinks(3);
		lst1.AddLinks(1);
		lst1.AddLinks(5);
		lst1.AddLinks(9);
		ListNode output = detectCycle(lst1.head);
	if(output != null){
		System.out.println(output);
	}
	else System.out.println("Input LinkedList has no cycle");
	}

}
