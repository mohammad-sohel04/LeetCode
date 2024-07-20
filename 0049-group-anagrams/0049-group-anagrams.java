class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list=new ArrayList<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
          if(strs[i]=="-1")continue;
          List<String>temp=new ArrayList<>();
          temp.add(strs[i]);
          for(int j=i+1;j<n;j++){
            if(helper(strs[i],strs[j])){
              temp.add(strs[j]);
              strs[j]="-1";
            }
          }
          list.add(temp);
        }
        return list;
    }
    boolean helper(String s1,String s2){
      if(s1.length()!=s2.length())return false;
      int arr[]=new int[26];
      for(char ch:s1.toCharArray()){
        if(ch>='a' && ch<='z')arr[ch-'a']++;
    }
    //int pre=set.size();
    for(char ch:s2.toCharArray()){
      //set.add(ch);
      if(ch>='a' && ch<='z')arr[ch-'a']--;
    }
    for(int x:arr){
      if(x!=0)return false;
    }
    return true;

    }
}