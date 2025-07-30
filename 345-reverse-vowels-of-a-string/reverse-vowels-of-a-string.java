class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char ch[]=s.toCharArray();
        while(i<j){
            if(!isVowel(ch[i])){
               i++;
               continue;
            }
            if(!isVowel(ch[j])){
                j--;
                continue;
            }
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        s=new String(ch);
        return s;
    }
    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
             || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}