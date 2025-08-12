class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int flag=0;
           for(int j=0;j<nums.length;j++){
            if(i!=j && nums[i]==nums[j]){
                flag=1;
                break;
            }
           }
           if(flag==0){
            al.add(nums[i]);
           }
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
}