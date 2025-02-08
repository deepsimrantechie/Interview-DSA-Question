///rotate the linked list according to the given k

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
    public ListNode rotateRight(ListNode head, int k) {

        //checking the linkedlist is empty or not 
        if(head == null ||head.next == null || k==0)return head;
//here we are storing the length of linked in the n varible
        int n = Length(head);
        k = k%n;
        if(k==0)return head;
//here we will find the tail and the head of the linked list and also where we have to break the linked list 
        ListNode current = head;
        for(int i=0;i<n-k-1;i++){
            current = current.next;
        }
        ListNode newHead = current.next;
        current.next= null;
//here we are basically we connecting the older linked list with the new linked list 
        ListNode temp = newHead;
       while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;

        return newHead;

    }

    //here is the function for counting the length of the linkedlist 
    public int Length(ListNode head){
       ListNode current = head;
        int count =0;

        //using while loop we are iteraing or increeasing the value of count 
        while(current != null){
            count ++;
            current = current.next;
        }
        return count;
    }
    
}