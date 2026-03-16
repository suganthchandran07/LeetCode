class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int left = i + 1, right = n - 1;
            int complement = target - numbers[i];
            while (left <= right) {
                int mid = left + (right - left)/2;
                if (numbers[mid] == complement) return new int[]{i+1, mid+1};
                if (numbers[mid] < complement) left = mid + 1;
                else right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}