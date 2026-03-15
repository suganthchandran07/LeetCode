class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (currentSum + num < num)
                currentSum = num;
            else
                currentSum += num;
            if (maxSum < currentSum)
                maxSum = currentSum;
        }
        return maxSum;
    }
}