class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)return true;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean left=(i==0 ||flowerbed[i-1]==0)?true:false;
                boolean right=(i==flowerbed.length-1||flowerbed[i+1]==0)?true:false;
                if(left&&right){
                    n--;
                    flowerbed[i]=1;
                    if(n==0)return true;

                }
            }
            
        }
        return n==0;
    }
}