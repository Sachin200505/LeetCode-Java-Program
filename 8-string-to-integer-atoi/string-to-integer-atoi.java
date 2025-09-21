class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int sign = 1;
        if (s.startsWith("-")) {
            sign = -1;
            s = s.substring(1);
        } else if (s.startsWith("+")) {
            s = s.substring(1);
        }
        int i = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            i++;
        }
        s = s.substring(0, i);
        if (s.length() == 0) return 0;
        long num = 0;
        try {
            num = Long.parseLong(s) * sign;
        } catch (NumberFormatException e) {
            return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) num;
    }
}
