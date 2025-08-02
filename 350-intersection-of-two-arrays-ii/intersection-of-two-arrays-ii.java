class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    ArrayList<Integer> al=new ArrayList();
    ArrayList<Integer> n2=new ArrayList<>();
    for(int i=0;i<nums2.length;i++){
        n2.add(nums2[i]);
    }
    for(int i=0;i<nums1.length;i++){
        for(int j=0;j<n2.size();j++){
            if(nums1[i]==n2.get(j)){
                al.add(n2.get(j));
                n2.remove(j);
                break;
            }
        }
    }
    int a[]=new int[al.size()];
    for(int i=0;i<al.size();i++){
        a[i]=al.get(i);
    }
    return a;
    }
}