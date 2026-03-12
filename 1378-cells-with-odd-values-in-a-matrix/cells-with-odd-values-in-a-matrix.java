class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] num : indices) {
            row[num[0]]++;
            col[num[1]]++;
        }
        int oddRow = 0, oddCol = 0;
        for(int num : row)
            if (num % 2 != 0) oddRow++;
        for(int num : col)
            if (num % 2 != 0) oddCol++;
        return oddRow * (n - oddCol) + oddCol * (m - oddRow);
    }
}