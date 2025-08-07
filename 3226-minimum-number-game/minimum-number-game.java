class Solution {
    public int[] numberGame(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for (int num : nums) {
            al.add(num);
        }
        ArrayList<Integer> al1 = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++) {
            Collections.sort(al);
            for (int j = 1; j >= 0; j--) {
                al1.add(al.get(j));
                al.remove(j);
            }
        }
        int arr[] = new int[al1.size()];
        for (int i = 0; i < al1.size(); i++) {
            arr[i] = al1.get(i);
        }
        return arr;
    }
}
