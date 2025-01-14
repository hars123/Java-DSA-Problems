class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    Node head;

    
    public Node reverseInGroups(Node head, int k) {
        if (head == null) {
            return null;
        }

        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        // Reverse the first k nodes
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        
        if (next != null) {
            head.next = reverseInGroups(next, k);
        }

        
        return prev;
    }

   
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original List:");
        list.printList(list.head);

        int k = 3;
        list.head = list.reverseInGroups(list.head, k);

        System.out.println("Reversed List in groups of " + k + ":");
        list.printList(list.head);
    }
}
