
public class Findthestartingpointoftheloop {

    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public class DetectCycleStart {
        public static ListNode detectCycle(ListNode head) {
            ListNode slow = head, fast = head;
    
            // Step 1: Detect cycle using slow and fast pointers
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
    
                if (slow == fast) { // Cycle detected
                    // Step 2: Find the start of the loop
                    slow = head;
                    while (slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow; // The starting node of the cycle
                }
            }
    
            return null; // No cycle detected
        }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next; // Creating a cycle at node 3

        ListNode loopStart = detectCycle(head);
        if (loopStart != null) {
            System.out.println("Cycle starts at node with value: " + loopStart.val);
        } else {
            System.out.println("No cycle detected");
        }
    }
        
    }
}