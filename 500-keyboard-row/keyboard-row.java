class Solution {
    public String[] findWords(String[] words) {
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";
        List<String> res = new ArrayList<>();
        for (String word : words) {
            int aCount = 0, bCount = 0, cCount = 0;
            for (char wd : word.toLowerCase().toCharArray()) {
                String w = String.valueOf(wd);
                if (a.contains(w)) aCount++;
                if (b.contains(w)) bCount++;
                if (c.contains(w)) cCount++;
            }
            if (!(aCount != 0 && bCount != 0) 
                    && !(bCount != 0 && cCount != 0) 
                    && !(cCount != 0 && aCount != 0))
                res.add(word); 
        }
        String[] ans = new String[res.size()];
        int index = 0;
        for (String word : res) {
            ans[index++] = word;
        }
        return ans;
    }
}