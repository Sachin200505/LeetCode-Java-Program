class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        li.add(new ArrayList<>());    
        for (int num : nums) {
            int size = li.size();
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(li.get(i));
                newSubset.add(num);
                li.add(newSubset);
            }
        }
        return li;
    }
}
