class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int k = 0;
        boolean isEven = n%2 == 0;
        int range = isEven ? n/2 : (n-1)/2;
        for (int i = -range; i <= range; i++) {
            if(isEven && i == 0) continue;
            res[k++] = i;
        }
        return res;
    }
}