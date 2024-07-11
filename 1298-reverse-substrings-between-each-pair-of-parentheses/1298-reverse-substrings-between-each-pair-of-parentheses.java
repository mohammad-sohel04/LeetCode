class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer>st=new Stack<>();
        for(char ch:s.toCharArray()){
          if(ch=='('){
            st.push(sb.length());
          }
          else if(ch==')'){
            int start=st.pop();
            helper(sb,start,sb.length()-1);
          }
          else{
            sb.append(ch);
          }
        }
        return sb.toString();
    }
    void helper(StringBuilder sb,int st,int en){
      while(st<en){
        char temp=sb.charAt(st);
        sb.setCharAt(st,sb.charAt(en));
        sb.setCharAt(en,temp);
        st++;en--;
      }
    }
}