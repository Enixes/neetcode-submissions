class MinStack {

		Stack<Integer> main = new Stack<>();
		Stack<Integer> minStack = new Stack<>();
	public MinStack() {
		main = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		main.push(val);
		if (minStack.size() == 0) 
			minStack.push(val); 
		else {
			minStack.push(Math.min(val, minStack.peek()));
		}
	}

	public void pop() {
		main.pop();
		minStack.pop();
	}

	public int top() {
		return main.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
