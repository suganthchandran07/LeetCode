class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] res = new int[n+1];
        for (int i = 0; i < n; i++) {
            res[i+1] = res[i] + gain[i];
        }
        int max = 0;
        for (int num : res) {
            max = Math.max(max, num);
        }
        return max;
    }
}