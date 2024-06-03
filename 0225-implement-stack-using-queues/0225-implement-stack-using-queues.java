class MyStack {
  Queue<Integer>q;
  Queue<Integer>ref;
    public MyStack() {
        q=new ArrayDeque<>();
        ref=new ArrayDeque<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q.isEmpty())return -1;
        while(q.size()!=1){
          ref.add(q.poll());
        }
        int val= q.poll();
        while(!ref.isEmpty()){
          q.add(ref.poll());
        }
        return val;
    }
    
    public int top() {
        if(q.isEmpty())return -1;
        while(q.size()!=1){
          ref.add(q.poll());
        }
        int val= q.poll();
        while(!ref.isEmpty()){
          q.add(ref.poll());
        }
        q.add(val);
        return val;   
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */