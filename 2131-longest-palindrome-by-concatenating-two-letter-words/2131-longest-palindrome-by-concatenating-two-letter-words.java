class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();
        int len = 0;

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();

            if (hm.getOrDefault(rev, 0) > 0) {
                len += 4;
                hm.put(rev, hm.get(rev) - 1); 
            } else {
                hm.put(word, hm.getOrDefault(word, 0) + 1);
            }
        }

        for (String key : hm.keySet()) {
            if (key.charAt(0) == key.charAt(1) && hm.get(key) > 0) {
                len +=2;
                break;
            }
        }

        return len;
    }
}
