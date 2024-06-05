class Solution {
    public List<String> commonChars(String[] words) {
        List<String>list=new ArrayList<>();
        int ref[]=new int[26];
        for(char ch:words[0].toCharArray()){
          ref[ch-'a']++;
        }
        for(int i=1;i<words.length;i++){
          int cur[]=new int[26];
          for(char ch:words[i].toCharArray()){
            cur[ch-'a']++;
          }
          for(int j=0;j<26;j++){
            ref[j]=Math.min(ref[j],cur[j]);
          }
        }
        for(int i=0;i<26;i++){
          int count=ref[i];
          for(int j=1;j<=count;j++){
            list.add(Character.toString((char)(i+'a')));
          }
        }
        return list;
        
    }
}