class Solution {
    public boolean rotateString(String s, String goal) {
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.equals(goal)){
                return true;
            }
            else{
                char temp=ch[0];
                for(int j=0;j<s.length()-1;j++){
                      ch[j]=ch[j+1];
                }
                ch[s.length()-1]=temp;
                s=new String(ch);
            }
        }
        return false;
    }
}