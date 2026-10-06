class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == '.') continue;

                String row = board[i][j] + "_ROW_" +i;
                String col = board[i][j] + "_Col_" +j;
                String box = board[i][j] + "_BOX_" + ((i/3) * 3 + (j/3));

                if (set.contains(row) ||
                    set.contains(col) ||
                    set.contains(box)){
                        return false;
                    }
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
    }
}