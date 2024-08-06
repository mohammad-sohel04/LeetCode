class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        for(char ch:word.toCharArray()){
          freq[ch-'a']++;
        }
        int cur=1;
        int ans=0;
        Arrays.sort(freq);
        //System.out.println(Arrays.toString(freq));
        for(int i=25;i>=0 ;i--){
            if(cur<=8){
              ans+=1*freq[i];
              cur++;
            }
            else if(cur>8 && cur<=16){
              ans+=2*freq[i];
              cur++;
            }
            else if(cur>16 && cur<=24){
              ans+=3*freq[i];
              cur++;
            }
            else{
              ans+=4*freq[i];
              cur++;
            }
        }
        return ans;
    }
}