class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int  low=0;
        int high=(matrix.length*matrix[0].length)-1;
        int m=matrix[0].length;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}