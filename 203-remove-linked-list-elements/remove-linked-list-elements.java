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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode tra=head;
        while(tra!=null){
            if(tra.val!=val){
                temp.next=tra;
                tra=tra.next;
                temp=temp.next;
            }
            else{
                tra=tra.next;
            }
        }
        temp.next=null;
        return dummy.next;
    }
}