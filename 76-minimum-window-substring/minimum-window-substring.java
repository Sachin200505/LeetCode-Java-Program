import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] tFreq = new int[128];
        for (char ch : t.toCharArray()) {
            tFreq[ch]++;
        }

        int left = 0, right = 0;
        int count = 0; // how many characters matched
        int minLen = Integer.MAX_VALUE;
        int start = 0; // start index of minimum window

        int[] windowFreq = new int[128];

        while (right < s.length()) {
            char rChar = s.charAt(right);
            windowFreq[rChar]++;

            // If character in s is needed in t and its count is <= required
            if (tFreq[rChar] > 0 && windowFreq[rChar] <= tFreq[rChar]) {
                count++;
            }

            // When all characters matched
            while (count == t.length()) {
                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lChar = s.charAt(left);
                windowFreq[lChar]--;

                // If removing lChar breaks the match
                if (tFreq[lChar] > 0 && windowFreq[lChar] < tFreq[lChar]) {
                    count--;
                }

                left++; // shrink window from the left
            }

            right++; // expand window to the right
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
