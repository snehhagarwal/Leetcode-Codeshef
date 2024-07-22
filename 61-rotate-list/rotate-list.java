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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail=head;
        int cnt=1;
        while(tail.next!=null){
            tail=tail.next;
            cnt++;
        }
        k=k%cnt;
        if(k==0){
            return head;
        }
        tail.next=head;
        int kth=cnt-k;
        ListNode temp=head;
        for(int i=0;i<kth-1;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}