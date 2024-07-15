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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverse(slow.next);
        ListNode curr=head;
        while(newhead!=null){
            if(newhead.val!=curr.val){
                return false;
            }
            newhead=newhead.next;
            curr=curr.next;
        }
        return true;
    }

    public ListNode reverse(ListNode rev){
        if(rev==null || rev.next==null){
            return rev;
        }
        ListNode temp=reverse(rev.next);
        ListNode front=rev.next;
        front.next=rev;
        rev.next=null;
        return temp;
    }
}


// if(head==null){
//             return true;
//         }
//         Stack<Integer> st=new Stack<>();
//         ListNode temp=head;
//         while(temp!=null){
//             st.add(temp.val);
//             temp=temp.next;
//         }
//         ListNode curr=head;
//         while(curr!=null){
//             if(curr.val!=st.peek()){
//                 return false;
//             }
//             curr=curr.next;
//             st.pop();
//         }
//         return true;