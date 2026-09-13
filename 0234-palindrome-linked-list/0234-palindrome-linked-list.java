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
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode start;
        if(fast == null){
           start = reverse(slow);

        }else{
            start = reverse(slow.next);

        } 
        while(start!=null){
            if(start.val != head.val){
                return false;
            }
            start = start.next;
            head = head.next;
        }
        return true;
        
    }

    public ListNode reverse(ListNode start){
        ListNode prev = null;
        ListNode curr = start;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}