public class ReverseLinkedlist {
    public static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            
        }
    }

    public static class Linkedlist{
        Node head;

         public void Reverse(){
            Node previous = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current  = next;
                
            }
            head = previous;
         }

         public void PrintList(){
            Node temp = head;
            while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;                
            }
            System.out.println("null");
         }

        
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.head = new Node(4);
        list.head.next = new Node(5);
        list.head.next.next = new Node(6);
        list.PrintList();
        list.Reverse();
        list.PrintList();
        


       










        
        
    }
}