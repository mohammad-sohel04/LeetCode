class Solution {
    public boolean judgeSquareSum(int c) {
        //if(c>=2147482647)return false;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<=Math.sqrt(c);i++){
          list.add((int)Math.pow(i,2));
        }
        /*
        for(int i=0;i<list.size();i++){
          for(int j=i;j<list.size();j++){
            if(list.get(i)+list.get(j)==c)return true;
          }
        }
        return false;
        */
        // 
        //System.out.print(list);
        Map<Integer,Integer>map=new HashMap<>();
        int n=list.size();
        for(int i=0;i<n;i++){
          if(map.containsKey(c-list.get(i))||list.get(i)*2==c)return true;
          else map.put(list.get(i),0); 
        }
        return false;
    }
}