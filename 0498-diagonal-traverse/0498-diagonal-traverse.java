class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;

        for (int d = 0; d < m + n - 1; d++) {
            int r = (d < m) ? d : m - 1;
            int c = d - r;

            // If even diagonal, move up-right
            if (d % 2 == 0) {
                while (r >= 0 && c < n) {
                    result[idx++] = mat[r][c];
                    r--;
                    c++;
                }
            }
            // If odd diagonal, move down-left
            else {
                r = (d < n) ? 0 : d - n + 1;
                c = d - r;
                while (r < m && c >= 0) {
                    result[idx++] = mat[r][c];
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}