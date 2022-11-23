import java.util.*;
public class reverseLinkedList2_92 {

    public static Node head;
    public class Node {
        int data;
        Node next;
  
        Node(int d)
        {
            data = d;
            next = null;
        }
        }
        public static Node reverseBetween(Node head, int left, int right) {
        
            Node curr = head;
            Node prev = null;
            
            if(right == left){
                return head;
            }
            
            for(int i = 0 ; curr != null && i<left - 1; i++){
                prev = curr;
                curr = curr.next;
            }
            
            Node last = prev;
            Node newEnd = curr;
        
        
        Node curr1 = curr.next;
        
        for(int i = 0; curr != null && i< right-left+1; i++ ){
            curr.next = prev;
            prev = curr;
            curr = curr1;
            if(curr1 != null){
                curr1 = curr1.next;
            }
        }
        
        if(last != null){
            last.next =prev;
        }
        else{
            head = prev;
        }
        
        newEnd.next = curr;
        return head;
        }
        void printList(Node node)
        {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }
    public static void main(String[] args) {

        reverseLinkedList2_92 list = new reverseLinkedList2_92();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);
       reverseBetween(head, 1, 3); 
        list.printList(head);
    }
    }

        
