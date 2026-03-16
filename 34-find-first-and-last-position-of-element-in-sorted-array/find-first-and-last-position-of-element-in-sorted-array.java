class Solution {
    public int[] searchRange(int[] nums, int target) {
        // List<Integer> list = Arrays.stream(nums).boxed().toList();
        // return new int[]{list.indexOf(target), list.lastIndexOf(target)};
        return new int[]{findFirstIndex(nums, target), findLastIndex(nums, target)};
    }

    private int findFirstIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target)
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return ans;
    }

    private int findLastIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] < target)
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return ans;
    }
}