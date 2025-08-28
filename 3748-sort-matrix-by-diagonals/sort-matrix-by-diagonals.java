class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                map.computeIfAbsent(i - j, k -> new ArrayList<>()).add(grid[i][j]);
        for (int k : map.keySet())
            if (k >= 0) map.get(k).sort((a, b) -> b - a);
            else Collections.sort(map.get(k));
        Map<Integer, Integer> idx = new HashMap<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                int key = i - j, pos = idx.getOrDefault(key, 0);
                grid[i][j] = map.get(key).get(pos);
                idx.put(key, pos + 1);
            }
        return grid;
    }
}
