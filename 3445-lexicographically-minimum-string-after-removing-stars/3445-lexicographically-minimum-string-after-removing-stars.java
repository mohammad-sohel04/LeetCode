class Solution {
    public String clearStars(String s) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='*'){
            int val[]=pq.poll();
            sb.setCharAt(val[1],'*');
          }
          else{
            pq.offer(new int[]{(int)s.charAt(i),sb.length()});
            sb.append(s.charAt(i));
          }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<sb.length();i++){
          if(sb.charAt(i)!='*'){
            res.append(sb.charAt(i));
          }
        }
        
        return res.toString();

    }
}