class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int bank : account) {
                sum += bank;
            }
            if (max < sum)
                max = sum;
        }
        return max;
    }
}