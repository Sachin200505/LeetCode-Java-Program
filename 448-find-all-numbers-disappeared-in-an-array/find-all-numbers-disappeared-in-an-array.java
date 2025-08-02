class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> al = new ArrayList<>();
        int[] freq = new int[nums.length+1];
        for(int i=0;i<nums.length;i++) {
            freq[nums[i]] = 1;  
        }
        for(int i=1;i<=nums.length;i++) {
            if (freq[i]!=1) {
                al.add(i); 
            }
        }
        return al;
    }
}
