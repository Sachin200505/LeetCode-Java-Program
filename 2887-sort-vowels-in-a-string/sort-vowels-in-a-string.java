class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        List<Character> v = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) v.add(c);
        }
        Collections.sort(v);
        StringBuilder res = new StringBuilder();
        int j = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                res.append(v.get(j++));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
