class Solution {
    public int countNegatives(int[][] grid) {
        // Binary Search Approach
        // int res = 0;
        // int m = grid.length;
        // int n = grid[0].length;
        // for (int i = 0; i < m; i++) {
        //     if (grid[i][0] < 0) {
        //         res += n;
        //     } else if (grid[i][n-1] >= 0) {
        //         continue;
        //     } else {
        //         int left = 0, right = n-1;
        //         while (left <= right) {
        //             int mid = left + (right - left) / 2;
        //             if (grid[i][mid] >= 0) 
        //                 left = mid + 1;
        //             else 
        //                 right = mid - 1;
        //         }
        //         res += (n - left);
        //     }
        // }
        // return res;

        int rows = grid.length, cols = grid[0].length;
        int row = 0, col = grid[0].length - 1, count = 0;
        while(row < rows && col >= 0) {
            if (grid[row][col] >= 0)
                row++;
            else {
                count += rows - row;
                col--;
            }
        }
        return count;
    }
}