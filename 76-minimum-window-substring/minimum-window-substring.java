import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";
        int[] tFreq = new int[128];
        for (char ch : t.toCharArray()) {
            tFreq[ch]++;
        }
        int left = 0, right = 0;
        int count = 0; 
        int minLen = Integer.MAX_VALUE;
        int start = 0; 
        int[] windowFreq = new int[128];
        while (right < s.length()) {
            char rChar = s.charAt(right);
            windowFreq[rChar]++;
            if (tFreq[rChar] > 0 && windowFreq[rChar] <= tFreq[rChar]) {
                count++;
            }
            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char lChar = s.charAt(left);
                windowFreq[lChar]--;
                if (tFreq[lChar] > 0 && windowFreq[lChar] < tFreq[lChar]) {
                    count--;
                }
                left++; 
            }
            right++; 
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
