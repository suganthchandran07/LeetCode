class Solution {
    public String[] findWords(String[] words) {
        int[] row = new int[26];
        for (char a : "qwertyuiop".toCharArray()) row[a - 'a'] = 1;
        for (char a : "asdfghjkl".toCharArray()) row[a - 'a'] = 2;
        for (char a : "zxcvbnm".toCharArray()) row[a - 'a'] = 3;
        List<String> res = new ArrayList<>();
        for (String word : words) {
            String lower = word.toLowerCase();
            int a = row[lower.charAt(0) - 'a'];
            boolean valid = true;
            for (int i = 0; i < lower.length(); i++) {
                if (row[lower.charAt(i) - 'a'] != a) {
                    valid = false;
                    break;
                }
            }
            if (valid) res.add(word);
        }
        return res.toArray(new String[0]);

        // String a = "qwertyuiop";
        // String b = "asdfghjkl";
        // String c = "zxcvbnm";
        // List<String> res = new ArrayList<>();
        // for (String word : words) {
        //     int aCount = 0, bCount = 0, cCount = 0;
        //     for (char wd : word.toLowerCase().toCharArray()) {
        //         String w = String.valueOf(wd);
        //         if (a.contains(w)) aCount++;
        //         if (b.contains(w)) bCount++;
        //         if (c.contains(w)) cCount++;
        //     }
        //     if (!(aCount != 0 && bCount != 0) 
        //             && !(bCount != 0 && cCount != 0) 
        //             && !(cCount != 0 && aCount != 0))
        //         res.add(word);
        // }
        // String[] ans = new String[res.size()];
        // int index = 0;
        // for (String word : res) {
        //     ans[index++] = word;
        // }
        // return ans;
    }
}