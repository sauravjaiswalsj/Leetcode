class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        // validate rows
        for (int row = 0; row < n; row++){
            HashSet<Character> set = new HashSet<>();
            for (int col = 0; col < m; col++){
                if (board[row][col] == '.') continue;
                if (set.contains(board[row][col]))
                    return false;
                else 
                    set.add(board[row][col]);
            }
        }

        // validate cols:
        for (int col = 0; col < 9; col++){
            HashSet<Character> set = new HashSet<>();
            for (int row = 0; row < 9; row++){
                if (board[row][col] == '.') continue;
                if (set.contains(board[row][col]))
                    return false;
                else 
                    set.add(board[row][col]);
            }
        }

        // validate box

        for (int sr = 0; sr < 9; sr += 3){
            int er = sr + 3;
            for (int sc = 0; sc < 9; sc += 3){
                int ec = sc + 3;

                if (!isValid(board, sr, er, sc, ec))
                    return false;
            }
        }
        return true;
    }
    private boolean isValid(char[][] board, int sr, int er, int sc, int ec){
        HashSet<Character> set = new HashSet<>();
        for (int row = sr; row < er; row++){
            for (int col = sc; col < ec; col++){
                if (board[row][col] == '.') continue;
                if (set.contains(board[row][col]))
                    return false;
                else 
                    set.add(board[row][col]);
            }
        }
        return true;
    }
}