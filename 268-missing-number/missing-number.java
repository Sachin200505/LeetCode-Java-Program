class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        for(int i=0;i<=max;i++){
            if(i==nums[i]){
                continue;
            }
            else{
                return i;
            }
        }
        return max+1;
    }
}