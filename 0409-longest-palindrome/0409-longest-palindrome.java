class Solution {
    public int longestPalindrome(String s) {
        int count[]=new int [128];
        for(char ch:s.toCharArray()){
          count[ch]++;
        }
        int mid=-1;
        for(int i=0;i<128;i++){
          if(count[i]%2!=0){
            mid++;
            //System.out.println("mid "+mid+" char "+count[i]);
          }
        }
        return mid>=0? s.length()-mid:s.length();
    }
}