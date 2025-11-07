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
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0,head);

        ListNode curr =head;
        ListNode pre = dummy;

        while(curr!=null && curr.next!=null){
            ListNode temp = curr.next;

            curr.next = temp.next;

            temp.next= curr;

            pre.next = temp;

            pre =curr;

            curr = curr.next;



        }

        return dummy.next;
        
    }
}