class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int firstSearch = binary(nums, target, 0, pivot);
        if (firstSearch != -1) return firstSearch;
        return binary(nums, target, pivot + 1, nums.length - 1);
    }

    private int findPivot(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1])
                return mid;
            else if (nums[left] > nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

     private int binary(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}