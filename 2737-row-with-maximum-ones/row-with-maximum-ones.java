class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        //Arrays.sort(mat,Comparator.comparingInt(i->i[0]));
        int cnt=0;
        int idx=-1;
        for(int i=0;i<mat.length;i++){
            int counter=mat[i].length-firstoccurence(mat[i],1);
            if(counter>cnt){
                idx=i;
                cnt=counter;
            }
        }
        if(idx==-1){
            idx=0;
        }
        return new int[]{idx,cnt};
    }
    public static int firstoccurence(int[] mat,int k){
        Arrays.sort(mat);
        int low=0;
        int high=mat.length-1;
        int ans=mat.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mat[mid]==1){
                ans=mid;
                high=mid-1;
            }
            else if(mat[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}