class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<ClassInfo> pq = new PriorityQueue<>((a, b) -> Double.compare(b.gain(), a.gain()));
        for (int[] c : classes) {
            pq.offer(new ClassInfo(c[0], c[1]));
        }
        for (int i = 0; i < extraStudents; i++) {
            ClassInfo top = pq.poll();
            top.pass++;
            top.total++;
            pq.offer(top);
        }
        double sum = 0.0;
        while (!pq.isEmpty()) {
            ClassInfo curr = pq.poll();
            sum += (double) curr.pass / curr.total;
        }
        return sum / classes.length;
    }

    static class ClassInfo {
        int pass, total;
        ClassInfo(int p, int t) {
            this.pass = p;
            this.total = t;
        }
        double gain() {
            return (double)(pass + 1) / (total + 1) - (double) pass / total;
        }
    }
}
