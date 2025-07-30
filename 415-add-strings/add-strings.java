class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        int sum;
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = 0;
            int digit2 = 0;
            if(i >= 0) {
                digit1 = num1.charAt(i) - '0';
                i--;
            }
            if(j >= 0) {
                digit2 = num2.charAt(j) - '0';
                j--;
            }
            sum = digit1 + digit2 + carry;
            str.append(sum % 10);
            carry = sum / 10;
        }
        return str.reverse().toString();
    }
}
