class Solution {
    static class Pair implements Comparable<Pair> {
            int dif;
            int pro;
            Pair (int dif, int pro) //constructor 
            {
                this.dif = dif;
                this.pro = pro;
            }
            public int compareTo(Pair other) //making it only compare dif values
            {
                return this.dif - other.dif;
            }
    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        int len = difficulty.length;
        Pair[] pairs = new Pair[len];
        for (int i=0; i< len; i++){
            pairs[i] = new Pair(difficulty[i], profit[i]);
        }
        Arrays.sort(pairs);
        
        int maxProfit = 0;
        //get max profit from possible difficulty work
        int maxSoFar[] = new int[len];
        maxSoFar[0] = pairs[0].pro;
        for(int i = 1; i < len; i++) {
            if (pairs[i].pro > maxSoFar[i-1]) {
                maxSoFar[i] = pairs[i].pro;
            } else {
                maxSoFar[i] = maxSoFar[i-1];
            }
        }

        //System.out.println("checking workers cap now....");

        for(int i = 0; i<worker.length; i++) {
            int index = getIndex(worker[i], pairs, len);
            //System.out.println("index: " + index + " for item: " + worker[i]);

            if(index != -1) {
                 maxProfit += maxSoFar[index];;
            }
           
        }
        return maxProfit;
    }

    private int getIndex(int cap, Pair []pair, int len) {
        int low = 0;
        int high = len-1;
        while (low <= high) {
            int mid = (high+low)/2;
            if (pair[mid].dif == cap ) {
                //Check for same items
                while(mid < high && pair[mid+1].dif == cap) mid ++;
                return mid;
            } else if (pair[mid].dif < cap) {
                low = mid+1 ;
            } else if (pair[mid].dif > cap) {
                high = mid-1 ;
            }
        }
        return high;
    }
}