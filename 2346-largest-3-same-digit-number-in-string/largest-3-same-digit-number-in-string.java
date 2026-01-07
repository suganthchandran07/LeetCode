class Solution {
    public String largestGoodInteger(String num) {   
        String max = "";     
        for (int i = 0; i < num.length() - 2; i++) {
            if ((num.charAt(i) == num.charAt(i+1)) && (num.charAt(i) == num.charAt(i+2))) {
                String a = String.valueOf(num.charAt(i)).repeat(3);
                if(a.compareTo(max) > 0)   max = a;
            }
        }
        return max;
    }
}