class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n;
        int a = 0;
        for (int i = 0; i < total && a < n; i++) {
            if (i >= m + a || nums1[i] > nums2[a]) {
                for (int j = total - 1; j > i; j--) {
                    nums1[j] = nums1[j - 1];
                }
                nums1[i] = nums2[a];
                a++;
            }
        }
    }
}
