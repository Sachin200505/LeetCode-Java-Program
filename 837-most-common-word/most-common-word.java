class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert to lowercase
        paragraph = paragraph.toLowerCase();

        // Replace punctuation with space
        char[] chars = paragraph.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '!' || chars[i] == '?' || chars[i] == '\'' ||
                chars[i] == ',' || chars[i] == ';' || chars[i] == '.') {
                chars[i] = ' ';
            }
        }
        paragraph = new String(chars);

        // Split words
        String[] words = paragraph.split("\\s+");

        // Put banned words in a set
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Count frequencies
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            if (word.length() > 0 && !bannedSet.contains(word)) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }

        // Find most frequent word
        String result = "";
        int maxCount = 0;
        for (String word : countMap.keySet()) {
            if (countMap.get(word) > maxCount) {
                result = word;
                maxCount = countMap.get(word);
            }
        }

        return result;
    }
}
