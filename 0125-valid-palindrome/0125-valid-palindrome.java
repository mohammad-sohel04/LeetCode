class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        System.out.println(s);
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
          if( (ch>='a' && ch<='z') ||( ch>='0' && ch<='9' )){
            sb.append(ch);
          }
        }
         s=sb.toString();
        return sb.reverse().toString().equals(s);
    }
}