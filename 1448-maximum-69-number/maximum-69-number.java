class Solution {
    public int maximum69Number (int num) {
        // return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));

        char[] nums = String.valueOf(num).toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '6') {
                nums[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(nums));
    }
}