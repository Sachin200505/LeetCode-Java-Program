class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int reshape[][]=new int[r][c];
        if((mat.length*mat[0].length)!=(r*c)){
            return mat;
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                al.add(mat[i][j]);
            }
        }
        System.out.println(al);
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                reshape[i][j]=al.get(k);
                k++;
            }
        }
        return reshape;
    }
}