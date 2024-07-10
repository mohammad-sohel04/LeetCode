class Solution {
    public int minOperations(String[] logs) {
        List<String>list=new ArrayList<>();
        for(String str:logs){
          if(str.equals("./")){
            continue;
          }
          else if(str.equals("../") ){
            if( list.size()>0)list.remove(list.size()-1);
          }
          else if(str.equals("x/"))break;
          else{
            list.add(str);
          }
        }
      //  System.out.println(list);
        return list.size();
    }
}