class MyQueue {
  Stack<Integer>q;
  Stack<Integer>st;
    public MyQueue() {
        q=new Stack<>();
        st=new Stack<>();
    }
    
    public void push(int x) {
        if(q.isEmpty()){
          q.push(x);
        }  
        else{
        while(!q.isEmpty()){
          st.push(q.pop());
        }
        q.push(x);
        while(!st.isEmpty()){
          q.push(st.pop());
        }
      }
      
      
    }
    
    public int pop() {
        if(q.isEmpty())return -1;
        return q.pop();
    }
    
    public int peek() {
        if(q.isEmpty())return -1;
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */