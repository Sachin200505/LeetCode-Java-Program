class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArray[]=IntStream.concat(IntStream.of(nums1),IntStream.of(nums2)).toArray();
        Arrays.sort(mergedArray);
        int n=mergedArray.length;
        if (n % 2 == 1) {
            return mergedArray[n / 2];
        } else {
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        }
    }
}