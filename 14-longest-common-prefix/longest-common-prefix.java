class Solution {
    public String longestCommonPrefix(String[] strs) {
        ArrayList<ArrayList<String>> li = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            ArrayList<String> al = new ArrayList<>();
            for (int j = 1; j <= strs[i].length(); j++) { 
                String sub = strs[i].substring(0, j); 
                al.add(sub);
            }
            li.add(al);
        }
        int min = li.get(0).size();
        for (int i = 1; i < li.size(); i++) {
            min = Math.min(min, li.get(i).size());
        }
        String fin = "";
        for (int i = 0; i < min; i++) {
            String l = li.get(0).get(i); 
            boolean allMatch = true;
            for (int j = 1; j < li.size(); j++) {
                if (!li.get(j).get(i).equals(l)) { 
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) {
                fin = l; 
            } else {
                break; 
            }
        }
        System.out.println(li);
        return fin; 
    }
}
