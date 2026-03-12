class Solution {
    public boolean checkIfPangram(String sentence) {
        // Set<Character> set = new HashSet<>();
        // for (char c : sentence.toCharArray()) {
        //     set.add(c);
        // }
        // return set.size() == 26;

        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) < 0)
                return false;
        }
        return true;
    }
}