class Solution {
    public String reverseWords(String s) {
        String sp[]=s.split(" ");
        for(int i=0;i<sp.length;i++){
             sp[i]=rev(sp[i]);
        }
        return String.join(" ",sp);
    }
    private String rev(String s){
        int i=0,j=s.length()-1;
        char ch[]=s.toCharArray();
        while(i<j){
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            i++;j--;
        }
        return new String(ch);
    }
}