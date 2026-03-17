class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1)
            return binary(nums, target, 0, nums.length - 1);
        if (nums[pivot] == target)
            return pivot;
        if (nums[0] > target)
            return binary(nums, target, pivot + 1, nums.length - 1);
        return binary(nums, target, 0, pivot - 1);
    }

    private int findPivot(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid < right && nums[mid] > nums[mid + 1])
                return mid;
            else if (mid > left && nums[mid] < nums[mid - 1])
                return mid - 1;
            else if (nums[mid] < nums[left])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
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