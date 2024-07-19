class Solution {
    public int lengthOfLongestSubstring(String s) {
      //s=s.trim();
    //   Set<String>set=new HashSet<>();
    //   if(s.length()==0)return 0;
    //     int ans=1;
    //     for(int i=0;i<s.length();i++){
    //       for(int j=i;j<s.length();j++){
    //           if(ans<(j-i+1)){
    //             //System.out.println(s.substring(i,j+1));
    //             if(helper(s.substring(i,j+1)) && !set.contains(s.substring(i,j+1))){
    //               ans=(j-i)+1;
    //               set.add(s.substring(i,j+1));
    //             }
    //           }
    //       }
    //     }
    //     return ans;
    // }
    // boolean helper(String s){
    //   int arr[]=new int[128];
    //   for(int i=0;i<s.length();i++){
    //     arr[s.charAt(i)]++;
    //   }
    //   for(int x:arr){
    //     if(x!=1 && x!=0)return false;
    //   }
    //   return true;
    Set<Character>set=new HashSet<>();
    int st=0,en=0,res=0;
    while(st<s.length() && en<s.length()){
      if(set.contains(s.charAt(st))==false){
        set.add(s.charAt(st++));
        res=Math.max(res,st-en);

      }
      else{
        set.remove(s.charAt(en++));
      }
    }
    return res;
    }
}