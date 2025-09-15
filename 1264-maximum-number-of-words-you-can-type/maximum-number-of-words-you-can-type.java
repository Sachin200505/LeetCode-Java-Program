class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String sp[]=text.split(" ");
        char ch[]=brokenLetters.toCharArray();
        int c=0;
        if(ch.length==0)
        {
            return sp.length;
        }
        for(int i=0;i<sp.length;i++){
            int flag=0;
            for(int j=0;j<ch.length;j++){
                if(sp[i].contains(String.valueOf(ch[j]))){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                c++;
            }
        }
        return c;
    }
}