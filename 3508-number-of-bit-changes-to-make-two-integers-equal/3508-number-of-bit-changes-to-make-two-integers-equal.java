class Solution {
    public int minChanges(int n, int k) {
       if(n==k)return 0;
       String s1=Integer.toBinaryString(n);
       String s2=Integer.toBinaryString(k);
       
       if(s1.length()>s2.length()){
        while(s2.length()!=s1.length()){
          s2="0"+s2;
        }
       }
       else if(s2.length()>s1.length()){
        while(s1.length()!=s2.length()){
          s1="0"+s1;
        }
       }
       //System.out.println(s1+" "+s2);
       int ans=0;
       for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)=='1' && s2.charAt(i)=='0'){
          ans++;
        }
        else if(s1.charAt(i)=='0' && s2.charAt(i)=='1')return -1;
       }
       return ans; 
    }
}