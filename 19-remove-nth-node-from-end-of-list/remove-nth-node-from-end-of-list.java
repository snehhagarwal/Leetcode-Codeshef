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
        if(head==null){// || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode front=slow.next;
        slow.next=front.next;
        front.next=null;
        //slow.next=slow.next.next;
        return head;
    }
}

// int cnt=0;
//         ListNode temp=head;
//         while(temp!=null){
//             cnt++;
//             temp=temp.next;
//         }
//         int k=cnt-n;
//         if(k==0){
//             return head.next;
//         }
//         ListNode kth=getNode(k-1,head);
//         ListNode front=kth.next;
//         kth.next=kth.next.next;
//         front.next=null;
//         return head;
//     }
//     public ListNode getNode(int k,ListNode head){
//         ListNode curr=head;
//         for(int i=0;i<k;i++){
//             curr=curr.next;
//         }
//         return curr;