import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums); 
        int smallestMissing = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallestMissing) {
                continue; 
            } else if (nums[i] == smallestMissing) {
                smallestMissing++; 
            } 
        }
        return smallestMissing;
    }
}
