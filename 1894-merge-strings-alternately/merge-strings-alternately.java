class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (word1.length() < word2.length()) {
            for (int i = word1.length(); i < word2.length(); i++) {
                sb.append(word2.charAt(i));
            }
        } else {
            for (int i = word2.length(); i < word1.length(); i++) {
                sb.append(word1.charAt(i));
            }
        }

        return sb.toString();
    }
}