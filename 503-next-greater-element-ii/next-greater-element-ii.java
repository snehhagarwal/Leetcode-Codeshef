class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] a=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                st.pop();
            }
            if(i<nums.length){
                if(st.isEmpty()){
                    a[i]=-1;//no modulo as less than n
                }else{
                    a[i]=st.peek();
                }
            }
            st.push(nums[i%nums.length]);
        }
        return a;
    }
}

//brute force
// int[] arr=new int[nums.length];
//         ArrayList<Integer> ans=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             int  flag=0;
//             for(int j=i+1;j<i+nums.length;j++){
//                 int idx=j%nums.length;
//                 if(nums[idx]>nums[i]){
//                     ans.add(nums[idx]);
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0){
//                 ans.add(-1);
//             }
//         }
//         for(int i=0;i<nums.length;i++){
//             arr[i]=ans.get(i);
//         }
//         return arr;