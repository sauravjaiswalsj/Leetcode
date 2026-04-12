class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board){
            Arrays.fill(row, '.');
        }

        boolean[] cols = new boolean[n];
        boolean[] diag = new boolean[2*n];
        boolean[] adiag = new boolean[2*n];
        int[] count = new int[1];
        count[0] = 0;
        backtrack(board, board.length, 0, cols, diag, adiag, count);
        return count[0];
    }
    private void backtrack(
       char[][] board,
        int n, 
        int row, 
        boolean[] cols,
        boolean[] diag,
        boolean[] adiag,
        int[] ans
    ){
        if (row == n){
            ans[0] += 1;
            return;
        }

        for (int col = 0; col < n; col++){
            int di = row + col;
            int adi = row - col + n; // to avoid -ve index 

            if (cols[col] || diag[di] || adiag[adi])
                continue;
            
            board[row][col] = 'Q';
            cols[col] = true;
            diag[di] = true;
            adiag[adi] = true;

            backtrack(board, n, row+1, cols, diag, adiag, ans);
            board[row][col] = '.';
            cols[col] = false;
            diag[di] = false;
            adiag[adi] = false;
        }
    }
}