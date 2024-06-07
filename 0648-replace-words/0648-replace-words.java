class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String[]arr=sentence.split("\\s+");
        Set<String>set=new HashSet<>(dict);

        StringBuilder sb=new StringBuilder();
        for(String temp:arr){
          int i=0;
          while(i<=temp.length()){
            String cur=temp.substring(0,i++);
            if(set.contains(cur)){
              sb.append(cur).append(" ");
              break;
            }
            if(i==temp.length()+1){
              sb.append(temp).append(" ");
            }
          }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
        
    }
}