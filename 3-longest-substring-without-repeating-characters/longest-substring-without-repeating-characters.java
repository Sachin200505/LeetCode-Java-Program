class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()<=1) return s.length();
        int max=0;
        int n=s.length();
        for (int i=0;i<n;i++) {
            if (n-i<=max) break;
            HashSet<Character> seen = new HashSet<>();
            for (int j=i;j<n;j++) {
                char c=s.charAt(j);
                if (seen.contains(c)) {
                    break; 
                }
                seen.add(c);
                max=Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}
