class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pas=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> al=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    al.add(1);
                }
                else{
                    int val=pas.get(i-1).get(j-1)+pas.get(i-1).get(j);
                    al.add(val);
                }
            }
            pas.add(al);
        }
            System.out.println(pas);
            return pas.get(rowIndex);
    
    }
}