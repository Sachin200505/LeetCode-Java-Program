class Solution {
    public String[] findWords(String[] words) {
        String one = "qwertyuiop";
        String two = "asdfghjkl";
        String three = "zxcvbnm";
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String a = words[i].toLowerCase();
            int flag = 0;
            if (one.indexOf(a.charAt(0)) != -1) {
                for (int j = 0; j < a.length(); j++) {
                    if (one.indexOf(a.charAt(j)) == -1) {
                        flag = 1;
                        break;
                    }
                }
            } else if (two.indexOf(a.charAt(0)) != -1) {
                for (int j = 0; j < a.length(); j++) {
                    if (two.indexOf(a.charAt(j)) == -1) {
                        flag = 1;
                        break;
                    }
                }
            } else if (three.indexOf(a.charAt(0)) != -1) {
                for (int j = 0; j < a.length(); j++) {
                    if (three.indexOf(a.charAt(j)) == -1) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                al.add(words[i]);
            }
        }
        String[] arr = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }

        return arr;
    }
}
