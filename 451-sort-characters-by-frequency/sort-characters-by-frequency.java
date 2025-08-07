class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int max=0,ind=0;
            for(int j=0;j<128;j++){
                if(freq[j]>max){
                    max=freq[j];
                    ind=j;
                }
            } 
            while(freq[ind]!=0){
                sb.append((char)(ind));
                freq[ind]--;
            }
        }
        return sb.toString();
    }
}