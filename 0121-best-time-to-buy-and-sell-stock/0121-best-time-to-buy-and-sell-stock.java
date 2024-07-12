class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
          int cur=prices[i]-min;
          min=Math.min(min,prices[i]);
          if(cur>profit){
            profit=cur;
          }
        }
        return profit;
    }
}