/**
 * Below program implements a Queue using two stacks
 */


import java.util.Stack;

public class Solution04 {
	Stack<Integer> stk1 = null;
	Stack<Integer> stk2 = null;

	public Solution04() {
		stk1 = new Stack<Integer>();
		stk2 = new Stack<Integer>();
	}

	public void push(int x) {
		stk1.push(x);
	}

	public int replace() {
		int ret = -1;
		if (stk2.isEmpty()) {
			while (!stk1.isEmpty()) {
				int val = stk1.pop();
				stk2.push(val);
			}
		}
		if (!stk2.isEmpty()) {
			ret = stk2.pop();
		}
		return ret;
	}

	public int peek() {
		int ret = -1;
		if (stk2.isEmpty()) {
			while (!stk1.isEmpty()) {
				int val = stk1.pop();
				stk2.push(val);
			}
		}
		if (!stk2.isEmpty()) {
			ret = stk2.peek();
		}
		return ret;
	}
	public static void main(String[] args) {

		Solution04 mq = new Solution04();

		mq.push(3);
		mq.push(2);
		mq.push(1);

		System.out.println(mq.replace());

		mq.push(4);
		mq.push(5);
		System.out.println(mq.replace());
		System.out.println(mq.replace());
		System.out.println(mq.replace());
		System.out.println(mq.replace());

	}

}
