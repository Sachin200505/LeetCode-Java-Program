class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        int flag=0;
        for(int i=0;i<16;i++){
            int a=(int)(Math.pow(4,i));
            if(a==n){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return true;
        }else{
            return false;
        }
    }
}