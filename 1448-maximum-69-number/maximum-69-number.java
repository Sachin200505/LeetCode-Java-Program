class Solution {
    public int maximum69Number (int num) {
        int n=num;
        ArrayList<Integer> list= new ArrayList<>();
       while(n!=0)
       {
            int d1=n%10;
            list.add(d1);
            n=n/10;
       }
       Collections.reverse(list);
       for(int i=0;i<list.size();i++){
        if(list.get(i)==6){
            list.set(i,9);
            break;
        }
       }
       int fin=0;
       for(int i=0;i<list.size();i++){
          fin=fin*10+list.get(i);
       }
       return fin;
    }
}