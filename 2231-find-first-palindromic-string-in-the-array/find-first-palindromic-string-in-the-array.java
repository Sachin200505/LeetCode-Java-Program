class Solution {
    public String firstPalindrome(String[] words) {
        String fin="";
        for(int i=0;i<words.length;i++){
            int flag=0;
            String a=words[i];
            int k=0;
            int j=a.length()-1;
            while(k<j){
               if(a.charAt(k)!=a.charAt(j)){
                flag=1;
                break;
               }
               k++;j--;
            }
            if(flag==0){
                fin=a;
                break;
            }
        }
        return fin;
    }
}