class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        int len=t.length();
        while(i<s.length() && j<t.length()){
          if(s.charAt(i)==t.charAt(j)){
            i++;j++;len--;
          }
          else{
            i++;
          }
        }
        return len;
    }
}