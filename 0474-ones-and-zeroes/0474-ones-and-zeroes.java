class Item {
    int zeros;
    int ones;

    public Item (int zeros, int ones){
        this.zeros = zeros;
        this.ones = ones;
    }
}
class Solution {
    private List<Item> count;
    private Integer[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        count = countItems(strs);
        dp = new Integer[101][101][601];
        return solve(m, n, 0);
    }

    private List<Item> countItems(String[] strs){
        List<Item> items = new ArrayList<>();

        for (String s : strs){
            int zeros = (int)s.chars().filter(c -> c == '0').count();
            int ones = s.length() - zeros;
            items.add(new Item(zeros, ones));
        }
        return items;
    }

    private int solve(int m, int n , int i){
        if (i >= count.size() || (m == 0 && n == 0))
            return 0;
        
        if (dp[m][n][i] != null)
            return dp[m][n][i];

        int take = 0;
        Item item = count.get(i);
        if (item.zeros <= m && item.ones <= n){
            take = 1 + solve(m - item.zeros, n - item.ones, i+1);
        }

        int skip = solve(m , n, i+1);

        return dp[m][n][i] = Math.max(take, skip);
    }
}