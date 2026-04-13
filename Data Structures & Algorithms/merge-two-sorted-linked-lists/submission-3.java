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

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head1 = list1;
        ListNode head2 = list2;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                if(list1.next != null && list1.next.val < list2.val){
                    list1 = list1.next;
                }
                else{
                    ListNode temp1 = list1.next;
                    list1.next = list2;
                    list1 = temp1;
                }
            }
            else{
                if(list2.next != null && list2.next.val <= list1.val){
                    list2 = list2.next;
                }
                else{
                    ListNode temp2 = list2.next;
                    list2.next = list1;
                    list2 = temp2;
                }
            }
        }
        if(head1.val < head2.val){
            return head1;
        }
        return head2;
    }
}