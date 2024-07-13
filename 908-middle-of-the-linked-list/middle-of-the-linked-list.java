/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        ListNode curr=head;
        ListNode ans=getNode(cnt/2,curr);
        return ans;
    }

    public ListNode getNode(int k,ListNode curr){
         for(int i=0;i<k;i++){
            curr=curr.next;
         }
         return curr;
    }
}