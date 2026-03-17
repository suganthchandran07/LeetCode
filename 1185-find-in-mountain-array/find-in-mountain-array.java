/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr, target);
        int firstRange = binary(mountainArr, target, 0, peak, true);
        if (firstRange != -1) return firstRange;
        return binary(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int findPeak(MountainArray arr, int target) {
        int left = 0, right = arr.length() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) > arr.get(mid+1))
                right = mid;
            else
                left = mid + 1;
        }
        return right;
    }

    private int binary(MountainArray arr, int target, int left, int right, boolean isAsc) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == target)
                return mid;
            else if (arr.get(mid) < target) {
                if (isAsc)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            else {
                if (isAsc)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return -1;
    }
}