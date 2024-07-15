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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;
        while(even!=null && even.next!=null){//even is ahead odd 
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
// if(head==null || head.next==null){
//             return head;
//         }
//         ArrayList<Integer> ans=new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null && temp.next!=null){
//             ans.add(temp.val);
//             temp=temp.next.next;    
//         }
//         if(temp!=null){
//             ans.add(temp.val);
//         }
//         ListNode curr=head.next;
//         while(curr!=null && curr.next!=null){
//             ans.add(curr.val);
//             curr=curr.next.next;
//         }
//         if(curr!=null){
//             ans.add(curr.val);
//         }
//         ListNode rev=head;
//         int idx=0;
//         while(rev!=null){
//             rev.val=ans.get(idx);
//             rev=rev.next;
//             idx++;
//         }
//         return head;