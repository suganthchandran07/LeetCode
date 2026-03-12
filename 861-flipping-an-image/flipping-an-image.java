class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // int n = image.length;
        // int[][] res = new int[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         res[i][j] = image[i][n-j-1];
        //         res[i][j] = res[i][j] == 1 ? 0 : 1;
        //     }
        // }
        // return res;

        int n = image.length;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n-1;
            while (left <= right) {
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;
                left++;
                right--;
            }
        }
        return image;
    }
}