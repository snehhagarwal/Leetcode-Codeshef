class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=maxele(mat,mid);
            int leftele=mid-1>0?mat[row][mid-1]:-1;
            int rightele=mid+1<mat[0].length?mat[row][mid+1]:-1;
            if(mat[row][mid]>leftele && mat[row][mid]>rightele){
                return new int[]{row,mid};
            }
            else if(mat[row][mid]<leftele){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int maxele(int[][] mat,int col){
        int max=0;
        int idx=0;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                idx=i;
            }
        }
        return idx;
    }
}