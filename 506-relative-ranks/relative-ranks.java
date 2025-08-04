class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] top = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            int max = Integer.MIN_VALUE;
            int ind = -1;
            for (int j = 0; j < score.length; j++) {
                if (score[j] > max) {
                    max = score[j];
                    ind = j;
                }
            }
            score[ind] = Integer.MIN_VALUE;
            if (i == 0)
                top[ind] = "Gold Medal";
            else if (i == 1)
                top[ind] = "Silver Medal";
            else if (i == 2)
                top[ind] = "Bronze Medal";
            else
                top[ind] = String.valueOf(i + 1);  
        }

        return top;
    }
}
