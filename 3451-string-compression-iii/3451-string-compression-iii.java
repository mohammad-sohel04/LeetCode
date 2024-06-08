class Solution {
    public String compressedString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();){
          char c=s.charAt(i);
          int num=0;
          while(i<s.length()&& s.charAt(i)==c && num<9){
            i++;num++;
          }
          sb.append(num).append(c);
        }
        return sb.toString();
    }
}