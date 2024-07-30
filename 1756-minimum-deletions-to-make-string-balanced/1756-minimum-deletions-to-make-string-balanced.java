class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int Aa[]=new int[s.length()];
        int a=0;
        for(int i=n-1;i>=0;i--){
          Aa[i]=a;
          if(s.charAt(i)=='a'){
            a++;
          }
        }
        int Bb[]=new int[n];
        int b=0;
        for(int i=0;i<n;i++){
          Bb[i]=b;
          if(s.charAt(i)=='b')b++;
        }
        // System.out.println(Arrays.toString(Aa));
        // System.out.println(Arrays.toString(Bb));
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
          int cur=Aa[i]+Bb[i];
          ans=Math.min(cur,ans);
        }
        return ans;
    }
}