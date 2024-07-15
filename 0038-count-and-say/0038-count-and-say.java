class Solution {
    public String countAndSay(int n) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
          sb=helper(i,sb);
          System.out.println(sb+"call");
        }
        return sb.toString();
    }
    StringBuilder helper(int k,StringBuilder sb){
      if(k==1){
        sb.append(1);
        return sb;
      }
    StringBuilder str=new StringBuilder();
    char arr[]=sb.toString().toCharArray();
        if(sb.length()==1){
        str.append(1);
        str.append(arr[0]);
        return str;
      }
      //System.out.println(sb);
      int cnt=1;
      for(int i=1;i<arr.length;i++){
          if(arr[i]==arr[i-1])cnt++;
          else{
            str.append(cnt);
            str.append(arr[i-1]);
            cnt=1;
          }
      }
      str.append(cnt);
      str.append(arr[arr.length-1]);
     System.out.println(str+" end");
      return str;
    }
}