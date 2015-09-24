/**
 * Belwo Program implements a Stack using three stacks
 * @author Anudeep
 *
 */

public class Solution01 {

	public int stackSize = 100;
	int[] bufStack = new int[stackSize * 3];
	int[] pointer = { -1, -1, -1 };

	boolean isEmpty(int stackNum) {
		return pointer[stackNum] == -1;
	}

	int peek(int stackNum) {
		int index = topOfStack(stackNum);
		return bufStack[index];
	}

	int pop(int stackNum)  {
		if (pointer[stackNum] == -1) {
			System.out.println("stack is empty");
		}
		int value = bufStack[topOfStack(stackNum)];
		pointer[stackNum]--; 
		return value;
	}

	void push(int stknum, int val) {
		if (pointer[stknum] + 1 >= stackSize) {
			System.out.println("Out of space");
		}
		pointer[stknum]++;
		bufStack[topOfStack(stknum)] = val;
	}

	int topOfStack(int stackNum) {
		return stackNum * stackSize + pointer[stackNum];
	}

	public static void main(String[] args) {
		
		Solution01 st = new Solution01();
		st.push(1, 2);
		st.push(1, 3);
		System.out.println("The value from the stack " +st.pop(1));
	}
}
