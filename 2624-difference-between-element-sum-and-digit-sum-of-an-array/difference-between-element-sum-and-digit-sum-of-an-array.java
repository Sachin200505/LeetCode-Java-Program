class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0,digSum=0;
        for(int i=0;i<nums.length;i++){
            eleSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(a>9){
              while(a!=0){
                digSum=digSum+(a%10);
                a/=10;
              }
              a=digSum;
            }
            else{
                digSum+=a;
            }
        }
        return eleSum-digSum;
    }
}