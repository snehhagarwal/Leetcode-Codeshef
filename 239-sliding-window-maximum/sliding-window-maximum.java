class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> dq=new ArrayDeque<>();
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
          if(!dq.isEmpty() && dq.peek()<=i-k){//window size badh gya hain to 
            dq.pollFirst();
          }
          while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){//smalller element removal
            dq.pollLast();
          }
          dq.offer(i);
          if(i>=k-1){//window size incr to mtlb ans mil jayegaa
              ans.add(nums[dq.peek()]);
          }
       }
       int[] arr=new int[ans.size()];
       for(int i=0;i<ans.size();i++){
        arr[i]=ans.get(i);
       }
       return arr;
    }
}
//  ArrayList<Integer> ans=new ArrayList<>();
//         for(int i=0;i<=nums.length-k;i++){
//             int sum=0;
//             for(int j=i;j<=i+k-1;j++){
//                 sum=Math.max(nums[j],sum);
//             }
//             ans.add(sum);
//         }
//         int[] arr=new int[ans.size()];
//         for(int i=0;i<ans.size();i++){
//             arr[i]=ans.get(i);
//         }
//         return arr;