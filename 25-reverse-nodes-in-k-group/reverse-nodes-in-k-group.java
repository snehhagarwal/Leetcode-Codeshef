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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevnode=null;
        while(temp!=null){
            ListNode kth=getnode(temp,k);
            if(kth==null){
                if(prevnode!=null){
                    prevnode.next=temp;
                }
                break;
            }
            ListNode nextnode=kth.next;
            kth.next=null;
            reverse(temp);
            if(temp==head){
                head=kth;
            }
            else{
                prevnode.next=kth;//after reverse
            }
            prevnode=temp;
            temp=nextnode;
        }
        return head;
    }

    public ListNode getnode(ListNode head,int k){
        ListNode temp=head;
        for(int i=0;i<k-1;i++){
            if(temp==null) return null;
            temp=temp.next;
        }
        return temp;
    }
    
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}