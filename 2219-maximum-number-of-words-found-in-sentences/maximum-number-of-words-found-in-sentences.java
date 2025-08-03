class Solution {
    public int mostWordsFound(String[] sentences) {
        ArrayList<ArrayList<String>> li=new ArrayList<>();
        for(int i=0;i<sentences.length;i++){
            ArrayList<String> al=new ArrayList<>();
            String a[]=sentences[i].split(" ");
            for(int j=0;j<a.length;j++){
                al.add(a[j]);
            }
            li.add(al);
        }
        int max=0;
        for(int i=0;i<li.size();i++){
            if(li.get(i).size()>max){
                max=li.get(i).size();
            }
        }
        return max;
    }
}