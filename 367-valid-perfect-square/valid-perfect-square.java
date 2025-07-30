class Solution {
    public boolean isPerfectSquare(int num) {
        int n=0;
        int flag=0;
        for(int i=0;i<=num/2;i++){
            if((i*i)==num){
               return true;
            }
            if(i*i>num){
                break;
            }
        }
        if(num==1){
            return true;
        }
        else{
            return false;
        }
    }
}