class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];
            for (int j = 0; j < n; j++) {
                res[r][j]++;
            }
            for (int k = 0; k < m; k++) {
                res[k][c]++;
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j]%2 != 0) count++;
            }
        }
        return count;
    }
}