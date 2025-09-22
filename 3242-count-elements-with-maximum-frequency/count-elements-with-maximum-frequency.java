class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<=100;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        for(int i=0;i<=100;i++){
            if(freq[i]==max){
                sum+=freq[i];
            }
        }
        return sum;
    }
}