class Solution {
    public int arrangeCoins(int n) {
        int c = 0;
        int i = 1; 
        while (n >= i) {
            n -= i;   
            c++;   
            i++;      
        }
        return c;
    }
}
