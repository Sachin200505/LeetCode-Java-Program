class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                System.out.println(nums[j]+" "+nums[i]);
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}