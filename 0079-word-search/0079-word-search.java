class Solution {
    private char[][] board;
    private String word;
    private int m;
    private int n;
    private int l;

    public boolean exist(char[][] board, String word) {
         l= word.length();

         m=board.length;
         n=board[0].length;

         this.word=word;

         this.board=board;

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                if(board[i][j]==word.charAt(0)){

                    if(dfs(i,j,0))return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int r,int c,int idx){

        if(idx==word.length())return true;


        if (r < 0 || r >= m || c < 0 || c >= n) return false;
        if (board[r][c] != word.charAt(idx)) return false;


        char temp=board[r][c];

         board[r][c] = '#';

        boolean found =
            dfs(r - 1, c, idx + 1) ||
            dfs(r + 1, c, idx + 1) ||
            dfs(r, c - 1, idx + 1) ||
            dfs(r, c + 1, idx + 1);

        board[r][c] = temp;
        return found;

    }
}