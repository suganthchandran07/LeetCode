class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // int m = mat.length;
        // int n = mat[0].length;
        // if (m*n != r*c) return mat;
        // int[] ans = new int[m*n];
        // int k = 0;
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         ans[k++] = mat[i][j];
        //     }
        // }
        // k = 0;
        // int[][] res = new int[r][c];
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         res[i][j] = ans[k++];
        //     }
        // }
        // return res;

        int m = mat.length;
        int n = mat[0].length;
        int row = 0, col = 0;
        if (r*c != m*n) return mat;
        int[][] res = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return res;
    }
}