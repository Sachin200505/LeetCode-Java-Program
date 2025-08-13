class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> al = new ArrayList<>();
        int[] maxFreq = new int[26];
        for (String b : words2) {
            int[] freq = new int[26];
            for (char c : b.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        for (String a : words1) {
            int[] freqA = new int[26];
            for (char c : a.toCharArray()) {
                freqA[c - 'a']++;
            }
            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if (freqA[i] < maxFreq[i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) al.add(a);
        }
        return al;
    }
}
