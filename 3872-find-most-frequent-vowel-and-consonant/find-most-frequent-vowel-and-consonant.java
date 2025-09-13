class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowels = new HashMap<>();
        HashMap<Character, Integer> consonants = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".contains(String.valueOf(ch))) {
                    vowels.put(ch, vowels.getOrDefault(ch, 0) + 1);
                } else {
                    consonants.put(ch, consonants.getOrDefault(ch, 0) + 1);
                }
            }
        }
        int maxVowel = 0;
        int maxConsonant = 0;
        for (int val : vowels.values()) {
            maxVowel = Math.max(maxVowel, val);
        }
        for (int val : consonants.values()) {
            maxConsonant = Math.max(maxConsonant, val);
        }
        return maxVowel + maxConsonant;
    }
}
