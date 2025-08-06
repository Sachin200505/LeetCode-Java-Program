class Solution {
    public boolean canAliceWin(int[] nums) {
        int sin=0,doub=0;
        for(int n:nums){
            if(n<=9){
                sin+=n;
            }
            else{
                doub+=n;
            }
        }
        System.out.println(sin+" "+doub);
        return (sin>doub || doub>sin)?true:false;
    }
}