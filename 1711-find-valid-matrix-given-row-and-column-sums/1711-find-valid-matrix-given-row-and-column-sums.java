import java.math.BigInteger;

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int ans[][] = new int[m][n];

        // Initializing the first column of the matrix
        for (int i = 0; i < m; i++) {
            ans[i][0] = rowSum[i];
        }

        // Adjusting each column based on the column sums
        for (int j = 0; j < n; j++) {
            BigInteger cur_sum = BigInteger.ZERO;
            for (int i = 0; i < m; i++) {
                cur_sum = cur_sum.add(BigInteger.valueOf(ans[i][j]));
            }
            helper(ans, cur_sum, j, colSum[j]);
        }
        return ans;
    }

    void helper(int ans[][], BigInteger sum, int col, int req) {
        BigInteger remove = sum.subtract(BigInteger.valueOf(req));
        for (int i = 0; i < ans.length; i++) {
            BigInteger el = BigInteger.valueOf(ans[i][col]).min(remove);
            if (col + 1 < ans[0].length) ans[i][col + 1] = el.intValue();
            ans[i][col] -= el.intValue();
            remove = remove.subtract(el);
        }
    }
}
