class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int minValue = Integer.MAX_VALUE, colIndex = 0;
            boolean isLucky = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    colIndex = j;
                }
            }
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIndex] > minValue) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) res.add(minValue);
        }
        return res;
    }
}