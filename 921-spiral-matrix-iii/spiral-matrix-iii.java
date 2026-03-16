class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int r = rStart, c = cStart, n = rows*cols, count = 0, steps = 1;
        int[][] res = new int[n][2];
        res[count++] = new int[]{r, c};
        while (count < n) {
            // East
            for (int i = 0; i < steps; i++) {
                c++;
                if (r >= 0 && r < rows && c >= 0 && c < cols)
                    res[count++] = new int[]{r, c};
            }

            // South
            for (int i = 0; i < steps; i++) {
                r++;
                if (r >= 0 && r < rows && c >= 0 && c < cols)
                    res[count++] = new int[]{r, c};
            }

            steps++;

            // West
            for (int i = 0; i < steps; i++) {
                c--;
                if (r >= 0 && r < rows && c >= 0 && c < cols)
                    res[count++] = new int[]{r, c};
            }

            // North
            for (int i = 0; i < steps; i++) {
                r--;
                if (r >= 0 && r < rows && c >= 0 && c < cols)
                    res[count++] = new int[]{r, c};
            }

            steps++;
        }
        return res;
    }
}