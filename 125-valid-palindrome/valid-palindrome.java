class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder("");
         for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        s=sb.toString();
        int j=s.length()-1;
        int flag=0;
        if(s.length()==0){
            return true;
        }
        else{
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(j)){
                flag=1;
                break;
            }
            j--;
        }
        if(flag==0) return true;
        else return false;
        }
    }
}