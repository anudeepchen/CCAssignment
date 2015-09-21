/**
 * The method checks if the two linkedlists are intersecting at a common node
 * Time Complexity : 0(N) and Space Complexity : 0(N)
 * @author Anudeep
 *
 */
public class Solution07 {

	public static void Intersection(LinkedList lst1,LinkedList lst2) {
		
		ListNode headA = lst1.head;
		ListNode headB = lst2.head;
		  if(headA == null || headB ==null)
		        System.out.println("Inputs are null");
		        
		        int lengthA = 0;
		        int lengthB = 0;
		        
		        ListNode listA = headA;
		        ListNode listB = headB;
		        
		        while(listA.next != null){
		            lengthA++;
		            listA = listA.next;
		        }
		        
		        while (listB.next != null) {
		            lengthB++;
		            listB = listB.next;
		        }
		    
		        if(lengthA > lengthB){
		            int diff = lengthA-lengthB;
		            while(diff >0){
		                headA = headA.next;
		                diff--;
		            }
		        }    
		    
		       else {
		           int diff = lengthB-lengthA;
		           while(diff > 0){
		               headB = headB.next;
		               diff--;
		           }
		       } 
		      
		      while(headA != null || headB != null){
		          if(headA.val == headB.val){
		              System.out.println(headA);;
		          }
		      
		         else{
		             headA = headA.next;
		             headB = headB.next;
		         }
		      }  
		    
		        System.out.println("No Intersection");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst1 = new LinkedList();
		lst1.AddLinks(3);
		lst1.AddLinks(1);
		lst1.AddLinks(5);
		lst1.AddLinks(9);
		LinkedList lst2 = new LinkedList();
		lst2.AddLinks(4);
		lst2.AddLinks(6);
		lst2.AddLinks(7);
		lst2.AddLinks(2);
		lst2.AddLinks(1);	
		Intersection(lst1,lst2);
	}
}
