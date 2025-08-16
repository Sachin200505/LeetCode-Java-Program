class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=word.indexOf(ch);
        if(ind>=0){
        char c[]=word.toCharArray();
        int j=ind;
        for(int i=0;i<=ind/2;i++){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            j--;
        }
        word=new String(c);
        return word;
        }
        return word;
    }
}