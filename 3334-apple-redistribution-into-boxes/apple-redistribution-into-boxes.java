class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleCount = 0;
        for (int a : apple) {
            appleCount += a;
        }
        Arrays.sort(capacity);
        int count = 0, len = capacity.length;
        for (int i = len - 1; i >= 0; i--) {
            appleCount -= capacity[i];
            count++;
            if (appleCount <= 0) return count;
        }
        return 0;
    }
}