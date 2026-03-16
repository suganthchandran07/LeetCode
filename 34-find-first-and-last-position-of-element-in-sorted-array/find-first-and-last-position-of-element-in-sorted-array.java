class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        return new int[]{list.indexOf(target), list.lastIndexOf(target)};
    }
}