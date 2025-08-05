class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0; i<digits.length;i++) {
            al.add(digits[i]);
        }
        int c = 1; 
        for (int i=al.size()-1;i>=0;i--) {
            int sum=al.get(i)+c;
            al.set(i,sum%10);
            c=sum/10;
        }
        if (c!=0) {
            al.add(0,c);
        }
        int arr[]=new int[al.size()];
        for (int i=0;i<al.size();i++) {
            arr[i]=al.get(i);
        }
        return arr;
    }
}
