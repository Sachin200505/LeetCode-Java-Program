class Solution {
    public String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        for (int start = 0; start < s.length(); start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, s.length() - 1);
            while (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}
