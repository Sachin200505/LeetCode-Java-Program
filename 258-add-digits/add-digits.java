class Solution {
    public int addDigits(int num) {
        if(num>0){
            while(num>9){
                int sum=0;
                while(num!=0){
                int ld=num%10;
                sum=sum+ld;
                num/=10;
                }
                num=sum;
            }
            return num;
        }
        else{
            return 0;
        }
    }
}