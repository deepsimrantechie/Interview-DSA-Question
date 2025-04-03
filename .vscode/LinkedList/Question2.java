// Java Program to sort a linked list of 0s, 1s 
// or 2s by updating links 

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
 
class GfG {
  
      // Sort a linked list of 0s, 1s and 2s 
    // by changing pointers
    static Node sortList(Node head) {
        Node zeroD = new Node(0);
        Node oneD = new Node(1);
        Node twoD = new Node(2);

        Node one = oneD;
        Node two = twoD;
        Node zero = zeroD;
        Node current = head;
        while(current!= null){
            if(one.data == 1){
                one.next = current;
                one = one.next;
            }else if(two.data== 2){
                two.next = current;
                two = two.next;
            }else{
                zero.next = current ;
                zero = zero.next;
                
            }
            current = current.next;

        }

        zero.next = (oneD.next!=null)?oneD.next:twoD.next;
        one.next = twoD.next;
        two.next =null;

        head = zeroD.next;
        return head;

    } 

    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }
  
      public static void main(String[] args) {
      
        // Create a hard-coded linked list:
        // 1 -> 1 -> 2 -> 1 -> 0 -> NULL 
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);

        System.out.print("Linked List before Sorting:");
        printList(head);

        head = sortList(head);

        System.out.print("Linked List after Sorting:");
        printList(head);
    }
}
