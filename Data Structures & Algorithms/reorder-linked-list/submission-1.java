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
        if(head.next == null || head.next.next == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = head2;
        ListNode temp = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = temp;
           if(temp != null)
                temp = temp.next;
        }

        temp = head;
        while(prev != null){
            ListNode temp2 = temp.next;
            temp.next = prev;
            temp = temp2;
            ListNode temp3 = prev.next;
            prev.next = temp;
            prev = temp3;
        }
    }
}
