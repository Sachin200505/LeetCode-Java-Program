class Solution {
    public void moveZeroes(int[] nums) {
        int k=nums.length-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
              if(nums[i]==0){
                for(int j=i;j<n-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[k]=0;
                k--;
                n--;
                i--;
              }
        }
    }
}