class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    // Backtracking method to solve the Sudoku
    boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {  // Loop through all rows
            for (int j = 0; j < 9; j++) {  // Loop through all columns
                if (board[i][j] == '.') {  // Find an empty cell
                    for (char k = '1'; k <= '9'; k++) {  // Try digits from '1' to '9'
                        if (possible(board, k, i, j)) {  // Check if placing k is possible
                            board[i][j] = k;  // Place the digit
                            if (solve(board)) {  // Recursively try to solve the rest of the board
                                return true;
                            }
                            board[i][j] = '.';  // Backtrack if it doesn't work
                        }
                    }
                    return false;  // Return false if no valid digit can be placed
                }
            }
        }
        return true;  // Return true when the board is completely filled
    }

    // Check if placing the digit ch at board[r][c] is valid
    boolean possible(char[][] board, char ch, int r, int c) {
        // Row check: Ensure ch is not already in the same row
        for (int j = 0; j < 9; j++) {
            if (board[r][j] == ch) {
                return false;
            }
        }

        
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == ch) {
                return false;
            }
        }

        // 3x3 Subgrid check: Ensure ch is not already in the 3x3 subgrid
        int blockRow = r / 3 * 3;
        int blockCol = c / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[blockRow + i][blockCol + j] == ch) {
                    return false;
                }
            }
        }

        return true;  // Valid placement if no conflict
    }
}
