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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int countA = 0;
        int countB = 0;
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(p1 != null){
            p1 = p1.next;
            countA++;
        }
          while(p2 != null){
            p2 = p2.next;
            countB++;
        }
        p1 = headA;
        p2 = headB;
        while(countA>countB){
            p1 = p1.next;
            countA--;
        }
         while(countA<countB){
            p2 = p2.next;
            countB--;
        }
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}