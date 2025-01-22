///question to find the either the cycle exist or not


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;

        while(fastptr!=null && fastptr.next != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next;
            if(slowptr==fastptr){
                return true;
            }
        }
        return false;

    }
}