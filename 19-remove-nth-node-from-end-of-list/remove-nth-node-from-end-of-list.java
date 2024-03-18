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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode a=head;
        ListNode b=head;
        for(int i=1;i<=n;i++){
            a=a.next;
        }
        if(a==null){
            return head.next;
        }
        while(a!=null && a.next!=null){
            a=a.next;
            b=b.next;
        }
        b.next=b.next.next;
        return head;
    }
}