class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[101];
        for (int[] log : logs) {
            year[log[0] - 1950]++;
            year[log[1] - 1950]--;
        }
        int maxPop = 0, current = 0, res = 1950;
        for (int i = 0; i < 101; i++) {
            current += year[i];
            if (current > maxPop) {
                maxPop = current;
                res = i + 1950;
            }
        }
        return res;
    }
}