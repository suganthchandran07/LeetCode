class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for (int num : candies)
            max = Math.max(max, num);
        for (int i = 0; i < candies.length; i++)
            res.add(i, max <= candies[i] + extraCandies);
        return res;
    }
}