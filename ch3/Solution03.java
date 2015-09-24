
/**
 * Program creates set of stacks. When a stack gets too high it creates a new stack 
 * SetOfStacks mimics actual stack with Push() and Pop() operation.
 */


import java.util.ArrayList;
import java.util.Stack;


public class Solution03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetOfStacks st = new SetOfStacks(3);
		st.push(1);
		st.push(2);
		st.push(3);
		
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		
		System.out.println(st.pop());
	}

}


class SetOfStacks{
	
	ArrayList<Stack> stacks;
	int capOfStack = 0;

	public SetOfStacks(int size){
		capOfStack = size;
		stacks = new ArrayList<Stack>();
	}
	
	public Stack getLastStack(){
		if(stacks.size() == 0)
            return null;
		return stacks.get(stacks.size()-1);
	}
	public void push(int x){
		Stack oldstk = getLastStack();         
		if(oldstk != null && oldstk.size()-1 < capOfStack){
			oldstk.push(x);
		}
		else{
			Stack nstk = new Stack();
			nstk.push(x);
			stacks.add(nstk);
		}
	}
	
	public int pop(){
		Stack lstStk = getLastStack();		
		int value = (int) lstStk.pop();	
		if(lstStk.size()-1 == 0) stacks.remove(stacks.size()-1);
		return value;
		
	}
}
