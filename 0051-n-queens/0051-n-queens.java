class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        boolean[] cols = new boolean[n];
        boolean[] diag = new boolean[2*n];
        boolean[] adiag = new boolean[2*n];
        backtrack(board, 0, res, cols, diag, adiag, board.length);
        return res;
    }

    private void backtrack(
        char[][] board, 
        int row, 
        List<List<String>> res,
        boolean[] cols,
        boolean[] diag,
        boolean[] adiag,
        int n
    ){
        if (row == board.length){
            res.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++){
            int di = row + col;
            int adi = row - col + n; // accomodate -ve index
            if (cols[col] || diag[di] || adiag[adi])
                continue;
            
            board[row][col] = 'Q';
            cols[col] = true;
            diag[di] = true;
            adiag[adi] = true;

            backtrack(board, row+1, res, cols, diag, adiag, n);

           board[row][col] = '.';
           cols[col] = false;
            diag[di] = false;
            adiag[adi] = false;
        }
    }

    private boolean isValid(char[][] board, int row, int col){
        // check for col
        int n = board.length;
        for (int i = row-1; i >= 0; i--){
            if (board[i][col] == 'Q')
                return false;
        }

        // check left diag row-1 & col -1
        for (int i = row-1, j = col-1; i >=0 && j >=0; i--, j--){
            if (board[i][j] == 'Q')
                return false;
        }

        // check right diag row-1 & col -1
        for (int i = row-1, j = col+1; i >=0 && j < n; i--, j++){
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    private List<String> construct(char[][] board){
        List<String> path = new ArrayList<>();

        for (char[] row : board){
            path.add(new String(row));
        }
        return path;
    }
}