class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleCount = Arrays.stream(apple).sum();
        Arrays.sort(capacity);
        int sum = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            sum += capacity[i];
            if (appleCount <= sum) return capacity.length-i;
        }
        return 0;
    }
}