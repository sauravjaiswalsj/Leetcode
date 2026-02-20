class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0, r = n-1;
        while ( l < m && r >= 0){
            if (matrix[l][r] == target)
                return true;
            else if (matrix[l][r] > target){
                r = r - 1;
            }else {
                l = l + 1;
            }
        }
        return false;
    }
}