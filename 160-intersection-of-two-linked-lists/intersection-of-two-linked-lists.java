/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//  //o(n1)+o(n2)+o(n1-n2)+o(n1)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA==null || headB==null){
            return null;
        }
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1!=t2){
             if(t1==null){
                t1=headB;
             }
             if(t2==null){
                t2=headA;
             }
             if(t1==t2){
                return t1;
             }
             t1=t1.next;
             t2=t2.next;
        }
        return t1;
    }
}
// ListNode temp=headA;
//         int l1=0;
//         while(temp!=null){
//             l1++;
//             temp=temp.next;
//         }
//         int l2=0;
//         temp=headB;
//         while(temp!=null){
//             l2++;
//             temp=temp.next;
//         }
//         if(l1<l2){
//             return intersection(headA,headB,l2-l1);
//         }
//         else{
//             return intersection(headB,headA,l1-l2);
//         }
//     }
//     public static ListNode intersection(ListNode small,ListNode large,int diff){
//         while(diff!=0){
//             diff--;
//             large=large.next;
//         }
//         while(small!=large){
//             small=small.next;
//             large=large.next;
//         }
//         return small;
//tc o(n1* )+o(n2*)
//sc o(n1)
// HashMap<ListNode,Integer> map=new HashMap<>();
//         ListNode temp=headA;
//         while(temp!=null){
//             map.put(temp,1);
//             temp=temp.next;
//         }
//         temp=headB;
//         while(temp!=null){
//             if(map.containsKey(temp)){
//                 return temp;
//             }
//             temp=temp.next;
//         }
//         return null;