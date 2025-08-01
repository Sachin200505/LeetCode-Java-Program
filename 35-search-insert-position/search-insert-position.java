class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0, flag=0;
        for (int i=0; i<nums.length;i++) {
            if (nums[i]==target) {
                index=i;
                flag=1;
                break;
            }
        }
        if (flag==1) {
            return index;
        } else {
            for (int i=0;i<nums.length;i++) {
                if (target<nums[i]) {
                    return i;
                }
            }
            return nums.length; 
        }
    }
}
