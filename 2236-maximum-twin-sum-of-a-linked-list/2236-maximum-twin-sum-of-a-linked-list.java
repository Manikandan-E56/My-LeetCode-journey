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
    public int pairSum(ListNode head) {

        List<Integer> arr=new ArrayList<>();

        for(; head!=null; head=head.next ){
            arr.add(head.val);
        }

        int sum=0;

        int n=arr.size();

        for(int i=0;i<(n>>1);++i){

            sum=Math.max(sum,arr.get(i)+arr.get(n-1-i));
        }
        return sum;
        
    }
}