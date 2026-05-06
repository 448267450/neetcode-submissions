class MinStack {
        Stack<Integer> stack;
        PriorityQueue<Integer> pq;
    public MinStack() {
        stack = new Stack<>();
        pq = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.push(val);
        pq.add(val);
    }
    
    public void pop() {
        
        pq.remove(stack.peek());
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}
