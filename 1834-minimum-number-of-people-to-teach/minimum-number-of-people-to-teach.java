class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        List<Set<Integer>> langList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Set<Integer> set = new HashSet<>();
            for (int l : languages[i]) set.add(l);
            langList.add(set);
        }
        Set<Integer> needTeach = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0] - 1, v = f[1] - 1;
            Set<Integer> su = langList.get(u), sv = langList.get(v);
            boolean can = false;
            for (int l : su) {
                if (sv.contains(l)) {
                    can = true;
                    break;
                }
            }
            if (!can) {
                needTeach.add(u);
                needTeach.add(v);
            }
        }
        if (needTeach.isEmpty()) return 0;
        int res = Integer.MAX_VALUE;
        for (int lang = 1; lang <= n; lang++) {
            int count = 0;
            for (int u : needTeach) {
                if (!langList.get(u).contains(lang)) count++;
            }
            res = Math.min(res, count);
        }
        return res;
    }
}
