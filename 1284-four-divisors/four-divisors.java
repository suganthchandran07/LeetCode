class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int count = 0, tempSum = 0;
            for (int i = 1; i*i <= num; i++) {
                if (num%i == 0) {
                    int j = num/i;
                    if (i == j) {
                        count++;
                        tempSum += i;
                    } else {
                        count += 2;
                        tempSum += i + j;
                    }
                    if (count > 4) break;
                }
            }
            if (count == 4) sum += tempSum;
        }
        return sum;
    }
}