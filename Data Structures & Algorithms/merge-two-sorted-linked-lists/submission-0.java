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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first=list1;
        ListNode second=list2;
        ListNode newList=new ListNode();
        ListNode dummy=newList;
        while(first!=null && second!=null){
            if(first.val<second.val){
                dummy.next=first;
                first=first.next;
            } else{
                dummy.next=second;
                second=second.next;
            }
            dummy=dummy.next;
        }
    
    while(first!=null){
        dummy.next=first;
        dummy=dummy.next;
        first=first.next;
    }
        while(second!=null){
        dummy.next=second;
        dummy=dummy.next;
        second=second.next;
    }
    return newList.next;
    }
}