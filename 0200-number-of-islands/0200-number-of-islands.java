class Solution {
    static int m;
    static int n;
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int islandCnt = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == '1'){
                    dfs(grid, i, j);
                    ++islandCnt;
                }
            }
        }
        return islandCnt;
    }

    private void dfs(char[][] grid, int i , int j){
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1')
            return;
        
        if (grid[i][j] == '$')
            return;

        grid[i][j] = '$';

        dfs(grid, i+1 , j);
        dfs(grid, i-1 , j);
        dfs(grid, i , j+1);
        dfs(grid, i , j-1);
    } 
}