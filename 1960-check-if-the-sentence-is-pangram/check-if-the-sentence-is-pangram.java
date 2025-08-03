class Solution {
    public boolean checkIfPangram(String sentence) {
        int freq[]=new int[26];
        for(int i=0;i<sentence.length();i++){
            freq[(int)sentence.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]<1){
                return false;
            }
        }
        return true;
    }
}