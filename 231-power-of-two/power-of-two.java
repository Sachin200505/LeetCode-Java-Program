class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        int flag=0;
        for(int i=0;i<=30;i++){
            int a=(int)Math.pow(2,i);
            System.out.println(a);
            if(n==a){
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