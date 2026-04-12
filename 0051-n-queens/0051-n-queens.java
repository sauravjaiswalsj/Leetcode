class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] queens = new int[n]; // queens[row] = col
        solve(n, 0, 0, 0, 0, queens, res);
        return res;
    }

    private void solve(int n, int row,
                       int cols,
                       int diag1,
                       int diag2,
                       int[] queens,
                       List<List<String>> res) {

        if (row == n) {
            res.add(buildBoard(queens, n));
            return;
        }

        int available = ((1 << n) - 1) & ~(cols | diag1 | diag2);

        while (available != 0) {

            int pos = available & -available; // pick rightmost bit
            available -= pos;

            int col = Integer.bitCount(pos - 1); 
            // converts bit → column index

            queens[row] = col;

            solve(
                n,
                row + 1,
                cols | pos,
                (diag1 | pos) << 1,
                (diag2 | pos) >> 1,
                queens,
                res
            );
        }
    }

    private List<String> buildBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();

        for (int r = 0; r < n; r++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[r]] = 'Q';
            board.add(new String(row));
        }

        return board;
    }
}