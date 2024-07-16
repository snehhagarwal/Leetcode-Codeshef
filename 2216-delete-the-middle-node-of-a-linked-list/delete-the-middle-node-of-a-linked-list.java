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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}

// if(head==null || head.next==null){
//             return head;
//         }
//         ListNode temp=head;
//         int cnt=0;
//         while(temp!=null){
//               cnt++;
//               temp=temp.next;
//         }
//         int mid=cnt/2;
//         ListNode curr=head;
//         while(curr!=null){
//              mid--;
//              if(mid==0){
//                 ListNode front=curr.next;
//                 curr.next=front.next;
//                 front.next=null;
//                 break;
//              }
//             curr=curr.next;
//         }
//         return head;
