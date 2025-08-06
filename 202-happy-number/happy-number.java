class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            int temp=n;
            int sum=0;
            while(temp!=0) {
                int ld=temp%10;
                ld=ld*ld;
                sum+=ld;
                temp/=10;
            }
            if (sum==1) return true;
            n=sum;
        }
        return false;
    }
}
