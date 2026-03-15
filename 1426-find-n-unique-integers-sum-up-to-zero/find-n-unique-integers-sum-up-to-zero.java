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

        // int[] res = new int[n];
        // int k = 0;
        // if (n%2 == 1)
        //     res[k++] = 0;
        // for (int i = 1; k < n; i++) {
        //     res[k++] = i;
        //     res[k++] = -i;
        // }
        // return res;
    }
}