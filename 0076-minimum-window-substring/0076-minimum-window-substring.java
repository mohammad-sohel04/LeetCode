class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        Map<Character,Integer>map1=new HashMap<>();
        for(char ch:t.toCharArray()){
          map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int need=t.length();
        int cur=0;
        int i=0,j=0;
        Map<Character,Integer>map2=new HashMap<>();
        while(true){
          //taking
            boolean f1=false,f2=false;
          while(i<s.length() && cur<need){
            char ch=s.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            if(map2.get(ch)<=map1.getOrDefault(ch,0)){
              cur++;
            }
            i++;
            f1=true;
          }
          //release
          while(j<i && cur==need){
            String temp=s.substring(j,i);
            char ch=s.charAt(j);
            if(ans.length()==0 || ans.length()>temp.length()){
              ans=temp;
            }
            if(map2.get(ch)==1){
              map2.remove(ch);
            }
            else{
              map2.put(ch,map2.get(ch)-1);
            }
            if(map1.containsKey(ch) && map2.getOrDefault(ch,0)<map1.get(ch)){
              cur--;
            }
            j++;
            f2=true;
          }
          if(!f1 && !f2)break;
        }
        return ans;
    }
}