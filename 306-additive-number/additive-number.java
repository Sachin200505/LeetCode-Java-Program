import java.math.BigInteger;
class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger a = new BigInteger(num.substring(0, i));
                BigInteger b = new BigInteger(num.substring(i, j));
                if (num.charAt(0) == '0' && i > 1) continue;
                if (num.charAt(i) == '0' && j - i > 1) continue; 
                String s = "" + a + b;
                BigInteger x = a, y = b;
                while (s.length() < n) {
                    BigInteger z = x.add(y);
                    s += z;
                    x = y;
                    y = z;
                }
                if (s.equals(num)) return true;
            }
        }
        return false;
    }
}
