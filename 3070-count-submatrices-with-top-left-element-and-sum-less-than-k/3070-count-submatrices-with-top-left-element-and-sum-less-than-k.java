class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        
        int row = grid.length, col = grid[0].length;
        int[][] prefixSum = new int[row][col];

        int count = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {

                int topSum = i - 1 >= 0 ? prefixSum[i - 1][j] : 0;
                int leftSum = j - 1 >= 0 ? prefixSum[i][j - 1] : 0;
                int diagSum = (i - 1) >= 0 && (j - 1) >= 0 ? prefixSum[i - 1][j - 1] : 0;

                prefixSum[i][j] = topSum + leftSum - diagSum + grid[i][j]; 

                if(prefixSum[i][j] <= k) count++;
            }
        }

        // System.out.println(Arrays.deepToString(prefixSum));

        return count;
    }
}