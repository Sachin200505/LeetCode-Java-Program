class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            if(nums[i]!=1 || i==nums.length-1){
                max=Math.max(max,c);
                c=0;
            }
        }
        return max;
    }
}