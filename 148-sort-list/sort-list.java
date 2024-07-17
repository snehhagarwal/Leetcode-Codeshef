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
//  if(head==null || head.next==null){
//             return head;
//         }
//         ListNode temp=head;
//         ArrayList<Integer> ans=new ArrayList<>();
//         while(temp!=null){
//             ans.add(temp.val);
//             temp=temp.next;
//         }
//         Collections.sort(ans);
//         ListNode curr=head;
//         int idx=0;
//         while(curr!=null){
//                curr.val=ans.get(idx);
//                idx++;
//                curr=curr.next;
//         }
//         return head;
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findmid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
    public ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }
            else{
                temp.next=right;
                temp=temp.next;
                right=right.next;
            }
        }
        while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right!=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}