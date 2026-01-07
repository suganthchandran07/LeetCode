class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleCount = 0;
        for (int a : apple) {
            appleCount += a;
        }
        Arrays.sort(capacity);
        int sum = 0, count = 0, len = capacity.length;
        for (int i = len - 1; i >= 0; i--) {
            sum += capacity[i];
            count++;
            if (appleCount <= sum) return count;
        }
        return 0;
    }
}