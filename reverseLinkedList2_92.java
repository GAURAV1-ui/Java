public class reverseLinkedList2_92 {

    public static ListNode head;
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public static ListNode reverseBetween(ListNode head, int left, int right) {
        
            ListNode curr = head;
            ListNode prev = null;
            
            if(right == left){
                return head;
            }
            
            for(int i = 0 ; curr != null && i<left - 1; i++){
                prev = curr;
                curr = curr.next;
            }
            
            ListNode last = prev;
            ListNode newEnd = curr;
        
        
        ListNode curr1 = curr.next;
        
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
        void printList(ListNode node)
        {
            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }
    public static void main(String[] args) {
        reverseLinkedList2_92 list = new reverseLinkedList2_92();
        list.head = new ListNode(10);
        list.head.next = new ListNode(20);
        list.head.next.next = new ListNode(30);
        list.head.next.next.next = new ListNode(40);
        list.head.next.next.next.next = new ListNode(50);
        list.head.next.next.next.next.next = new ListNode(60);
        list.head.next.next.next.next.next.next = new ListNode(70);
        reverseBetween(head,3,6);
        list.printList(head);
    }
    }

        
