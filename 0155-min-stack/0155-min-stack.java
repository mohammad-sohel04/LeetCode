class MinStack {
  Stack<Integer>st;
  Stack<Integer>min;
    public MinStack() {
        st=new Stack<>();
        //min=Integer.MAX_VALUE;
        min=new Stack<>();
    }
    
    public void push(int val) {
         st.push(val);
        if(min.isEmpty() || (!min.isEmpty() && min.peek() >= val)){
          min.push(val);
        }
       
    }
    
    public void pop() {
        if(st.isEmpty())return;
        if(st.peek().equals(min.peek())){
          min.pop();
        }
        st.pop();

    }
    
    public int top() {
        return st.isEmpty()?-1: st.peek();
    }
    
    public int getMin() {
        return min.isEmpty()?-1:min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */