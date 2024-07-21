class Solution {
    public boolean doesAliceWin(String s) {
        int vow=0;
        for(char ch:s.toCharArray()){
          if(ch=='a'){
            vow++;
          }
          else if(ch=='e'|| ch=='i' || ch=='o' || ch=='u')vow++;
        }
        if(vow==0)return false;
        if(vow%2!=0)return true;
        else return true;
    }
}