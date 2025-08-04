class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()==t.length()) {
            HashMap<Character, Character> hm = new HashMap<>();
            for (int i=0;i<s.length();i++) {
                if(!(hm.containsKey(s.charAt(i)))) {
                    if (hm.containsValue(t.charAt(i))) {
                        return false;
                    }
                    hm.put(s.charAt(i),t.charAt(i));
                } else {
                    if(hm.get(s.charAt(i))!= t.charAt(i)) {
                        return false;
                    }
                }
            }
            return true;
        } else{
            return false;
        }
    }
}
