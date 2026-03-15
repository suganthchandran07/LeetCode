class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int d0 = 0, d90 = 0, d180 = 0, d270 = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (target[i][j] == mat[i][j]) d0++;
                if (target[i][j] == mat[n-j-1][i]) d90++;
                if (target[i][j] == mat[n-i-1][n-j-1]) d180++;
                if (target[i][j] == mat[j][n-i-1]) d270++;
            }
        }
        int total = n*n;
        if (d0 == total || d90 == total || d180 == total || d270 == total)
            return true;
        return false;
    }
}