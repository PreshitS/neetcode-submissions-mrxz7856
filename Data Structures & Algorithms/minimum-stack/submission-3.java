class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            minStack.push(val);
        }
        else{
            minStack.push(Math.min(val, minStack.peek()));
        }
        stack.push(val); 
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();   
    }
}
