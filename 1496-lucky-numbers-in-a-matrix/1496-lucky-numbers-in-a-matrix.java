class Solution {
    public List<Integer> luckyNumbers (int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        List<Integer>mini=new ArrayList<>();
        List<Integer>maxi=new ArrayList<>();

        for(int j=0;j<n;j++){
          int cur=0;
          for(int i=0;i<m;i++){
            cur=Math.max(cur,mat[i][j]);
          }
          maxi.add(cur);
        }
        for(int i=0;i<m;i++){
          int cur=Integer.MAX_VALUE;
          for(int j=0;j<n;j++){
            cur=Math.min(cur,mat[i][j]);
          }
          mini.add(cur);
        }
        List<Integer>list= new ArrayList<>();
       //   System.out.println(maxi+" "+mini);
        for(int i=0;i<maxi.size();i++){
            if(mini.contains(maxi.get(i))){
              list.add(maxi.get(i));
            }
        }
        return list;
    }
}