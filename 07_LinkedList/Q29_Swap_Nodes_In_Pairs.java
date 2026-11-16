public class Q29_Swap_Nodes_In_Pairs {

    // ListNode class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Your original swapPairs method
    public ListNode swapPairs(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode temp = head;
        ListNode tail = null;

        while (temp != null && temp.next != null) {

            ListNode curr = temp;
            ListNode prev = null;

            ListNode nextPair = curr.next.next;

            for (int i = 1; i <= 2; i++) {

                ListNode forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }

            if (tail == null) {
                head = prev;
            } else {
                tail.next = prev;
            }

            temp.next = nextPair;
            tail = temp;
            temp = nextPair;
        }

        return head;
    }

    // Print Linked List
    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {

        Q29_Swap_Nodes_In_Pairs obj = new Q29_Swap_Nodes_In_Pairs();

        // Creating Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        head = obj.swapPairs(head);

        System.out.println("After Swapping Pairs:");
        printList(head);
    }
}