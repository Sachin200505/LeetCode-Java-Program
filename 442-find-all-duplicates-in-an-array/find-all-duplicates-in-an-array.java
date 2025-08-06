class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!(hs.contains(nums[i]))){
                hs.add(nums[i]);
            }
            else{
                al.add(nums[i]);
            }
        }
        return al;
    }
}