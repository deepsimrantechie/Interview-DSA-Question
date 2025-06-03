
//insert the Node in the circular linked list sorted

class Solution{
    public Node insetNode(Node head,int data){
        Node newNode = new Node(data);
        if(head== null){
            newNode.next = newNode;
            return newNode;
        }

        //if the node is the starting of the head;
        Node current = head;
        if(data<head.data){
            while(current.next != head){
                current = current.next;
            }
            current.next = newNode;
            newNode= head;
            return newNode;
        }
        current = head;
        while(current.next != head && current.next.data <data){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
}