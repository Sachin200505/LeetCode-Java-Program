class Solution {
    public int primePalindrome(int n) {
        while (true) {  
            if (isPrime(n) && isPalindrome(n)) {
                return n;  
            }
            n++;
            if (10000000 < n && n < 100000000) {
                n = 100000000;
            }
        }
    }
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static boolean isPalindrome(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        return sb.toString().equals(sb.reverse().toString());
    }
}
