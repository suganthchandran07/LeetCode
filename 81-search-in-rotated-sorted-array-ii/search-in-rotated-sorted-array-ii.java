class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1)
            return binary(nums, target, 0, nums.length - 1);
        if (nums[pivot] == target)
            return true;
        if (nums[0] > target)
            return binary(nums, target, pivot + 1, nums.length - 1);
        return binary(nums, target, 0, pivot - 1);
    }

    private int findPivot(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid < right && nums[mid] > nums[mid+1])
                return mid;
            else if (mid > left && nums[mid] < nums[mid-1])
                return mid - 1;
            if (nums[mid] == nums[left] && nums[mid] == nums[right]) {
                if (nums[left] > nums[left + 1]) return left;
                left++;
                if (nums[right] < nums[right - 1]) return right - 1;
                right--;
            } else if (nums[mid] > nums[left] || (nums[mid] == nums[left] && nums[mid] > nums[right]))
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    private boolean binary(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return true;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
}