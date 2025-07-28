class Solution {
    public int[] twoSum(int[] nums, int target) {
        int fin[]=new int[2];
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    fin[0]=i;
                    fin[1]=j;
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
        return fin;
    }
}