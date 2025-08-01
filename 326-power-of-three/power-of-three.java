class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int flag=0;
        for(int i=0;i<20;i++){
           int a=(int)Math.pow(3,i);
           if(a==n){
            flag=1;
            break;
           }
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }
}