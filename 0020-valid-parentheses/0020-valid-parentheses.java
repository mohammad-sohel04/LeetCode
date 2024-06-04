class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        if(s.length()%2!=0)return false;
        for(char ch : s.toCharArray()){
          if(ch=='(' || ch=='{' || ch=='['){
            st.push(ch);
          }
          else{
            if(st.isEmpty())return false;
            else if((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')){
              st.pop();
            }
            else{
              return false;
            }
          }
        }
        return st.isEmpty();
    }
}