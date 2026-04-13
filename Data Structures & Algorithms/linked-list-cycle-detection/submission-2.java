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
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode temp = head.next;
        while(head != null || temp != null){
            if(head == temp){
                return true;
            }
            if(head != null){
                head = head.next;
            }
            else{
                return false;
            }
            if(temp != null && temp.next != null){
                temp = temp.next.next;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
