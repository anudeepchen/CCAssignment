/**Below is the implementation of Stack in addition to push and pop it also has a
 * min function which returns the minimum element
 * 
 * @author Anudeep
 *
 */
import java.util.Stack;

class MinStack extends Stack{
    
    Stack<Integer> stk = new Stack<Integer>();
    public void push(int x) {
        if(x < getMin()){
           stk.push(x); 
        }
    super.push(x);        
    }

    public Object pop() {
      int val = (int) super.pop();
      if(val == getMin()){
    	  stk.pop();}
    return val;
    }

    public int getMin() {
    	if(stk.isEmpty())
    		return Integer.MAX_VALUE;
    	else
    	return stk.peek(); 
    }
}

public class Solution02 {

	public static void main(String[] args) {
		
		MinStack mainStack = new MinStack();
	
		mainStack.push(2);
		mainStack.push(11);
		mainStack.push(6);
		mainStack.push(5);
	
		System.out.println(mainStack.getMin());
	}
}
