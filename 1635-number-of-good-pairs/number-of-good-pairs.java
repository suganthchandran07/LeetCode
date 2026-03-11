class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int count = 0;
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i+1; j < n; j++) {
        //         if (nums[i] == nums[j]) count++;
        //     }
        // }
        // return count;

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            count += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}