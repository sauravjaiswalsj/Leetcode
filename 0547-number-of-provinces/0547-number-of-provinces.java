class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m = isConnected.length;
        int n = isConnected[0].length;
        boolean[] visited = new boolean[m];
        int province = 0;
        for (int i = 0; i < m; i++){
            if(!visited[i]){
                dfs(isConnected, visited, i);
                ++province;
            }
        }
        return province;
    }
    private void dfs(int[][] isConnected, boolean[] visited, int i){
        visited[i] = true;

        for (int j = 0; j < isConnected.length; j++){
            if (isConnected[i][j] == 1 && !visited[j]){
                dfs(isConnected, visited, j);
            }
        }
    }
}