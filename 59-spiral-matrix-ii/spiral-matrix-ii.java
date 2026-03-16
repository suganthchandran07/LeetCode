class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0, top = 0, val = 1;
        int right = n - 1, bottom = n - 1;
        int[][] matrix = new int[n][n];
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = val++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = val++;
            }
            right--;

            if (!(left <= right && top <= bottom)) break;

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = val++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = val++;
            }
            left++;
        }
        return matrix;
    }
}