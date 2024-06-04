class Solution {
    public int[] nextGreaterElement(int[] a1, int[] a2) {
        Map<Integer,Integer>map=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        for(int i=a2.length-1;i>=0;i--){
          while(!st.isEmpty() && a2[i]>=st.peek()){
            st.pop();
          }
          if(st.isEmpty()){
            map.put(a2[i],-1);
          }
          else{
            map.put(a2[i],st.peek());
          }
          st.push(a2[i]);
        }
        for(int i=0;i<a1.length;i++){
          a1[i]=map.get(a1[i]);
        }
        return a1;
    }
}