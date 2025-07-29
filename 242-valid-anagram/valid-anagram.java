class Solution {
    public boolean isAnagram(String s, String t) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        for(int i=0;i<s.length();i++){
              freq1[(int)(ch1[i]-97)]++;
        }
        for(int i=0;i<t.length();i++){
            freq2[(int)(ch2[i]-97)]++;
        }
        int flag=0;
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
              flag=1;
              break;
            }
        }
        for(int i=0;i<26;i++){
            System.out.println(freq1[i]+" "+freq2[i]);
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }
}