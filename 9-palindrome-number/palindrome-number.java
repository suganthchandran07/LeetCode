class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        int l = 0;
        int r = a.length() - 1;
        while (l < r) {
            if (a.charAt(l) != a.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}