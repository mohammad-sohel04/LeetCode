class Solution {
    public String minWindow(String s, String p) {
        String ans="";
        Map<Character,Integer>map1=new HashMap<>();
        for(char ch:p.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int cnt=0;
        int need=p.length();
        int i=0,j=0;
        Map<Character,Integer>map2=new HashMap<>();
        while(true){
            boolean f1=false,f2=false;
            // le ra
            while(i<s.length() && cnt<need){
                char ch=s.charAt(i);
                map2.put(ch,map2.getOrDefault(ch,0)+1);
                if(map2.get(ch)<=map1.getOrDefault(ch,0)){
                    cnt++;
                }
                i++;
                f1=true;
            }
            //release
            while(j<i && cnt==need){
                String temp=s.substring(j,i);
                // System.out.println(temp);
                // System.out.println(cnt);
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
                    if(map1.containsKey(ch) && map2.getOrDefault(ch,0)<map1.get(ch))cnt--;
                
                
                j++;
                
                f2=true;
                
            }
            //System.out.println(cnt);
            if(f1==false && !f2)break;
        }
        return ans;
    }
}