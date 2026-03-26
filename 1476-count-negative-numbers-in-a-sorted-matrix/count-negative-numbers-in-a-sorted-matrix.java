class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] < 0) {
                res += n;
            } else if (grid[i][n-1] >= 0) {
                continue;
            } else {
                int left = 0, right = n-1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (grid[i][mid] >= 0) 
                        left = mid + 1;
                    else 
                        right = mid - 1;
                }
                res += (n - left);
            }
        }
        return res;
    }
}