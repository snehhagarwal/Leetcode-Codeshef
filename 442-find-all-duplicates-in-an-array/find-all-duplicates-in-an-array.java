class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        //concept of cyclic sort but here we use marking
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            int index=Math.abs(ele)-1;
            if(arr[index]>0){
                arr[index]=-1*arr[index];
            }else{
                ans.add(index+1);
            }
        }
        return ans;
    }
}