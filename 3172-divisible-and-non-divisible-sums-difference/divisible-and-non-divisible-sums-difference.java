class Solution {
    public int differenceOfSums(int n, int m) {
        int diff1=0,diff2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                diff2+=i;
            }
            else{
                diff1+=i;
            }
        }
        int diff=diff1-diff2;
        return diff;
    }
}