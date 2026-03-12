class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, j = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n-j-1];
            j++;
        }
        int index = n/2;
        return n%2==1 ? sum - mat[index][index] : sum;
    }
}