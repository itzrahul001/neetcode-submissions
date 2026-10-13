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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

       
        ListNode prev=null;
        ListNode second=slow.next;
        slow.next=null;
        ListNode curr=second;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode temp1=head;
        ListNode temp2=prev;
        while(temp2!=null){
             ListNode firstNext=temp1.next;
             ListNode secondNext=temp2.next;
             temp1.next=temp2;
             temp2.next=firstNext;

             temp1=firstNext;
             temp2=secondNext;
        }
    }
}
