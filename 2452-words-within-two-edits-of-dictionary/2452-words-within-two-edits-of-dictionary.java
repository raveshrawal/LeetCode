class Solution {
    public boolean compareDifference(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        int diff = 0;
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        for (int i = 0; i < w1.length; i++) {
            if (w1[i] != w2[i]) {
                diff++;
            }
            if (diff > 2) {
                return false;
            }
        }
        return true;

    }

    public List<String> twoEditWords(String[] queries, String[] dictionary) {

        List<String> res = new ArrayList<String>();

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                if(compareDifference(queries[i], dictionary[j])){
                    res.add(queries[i]);
                    break;
                }
            }
        }
        return res;

    }
}