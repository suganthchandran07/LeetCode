class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            res.add(index[i], nums[i]);
        }
        return res.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}