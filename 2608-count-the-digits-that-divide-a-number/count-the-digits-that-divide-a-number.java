class Solution {
    public int countDigits(int num) {
        ArrayList<Integer> al=new ArrayList<>();
        int fin=0;
        int temp=num;
        while(temp!=0){
            al.add(temp%10);
            temp/=10;
        }
        for(int i=0;i<al.size();i++){
            if(num%al.get(i)==0){
                fin++;
            }
        }
        return fin;
    }
}