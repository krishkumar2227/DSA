public class Q12_Merge_Even_Odd_List {
  static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Your solution
    public static ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return head;
        }

        if (head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode oddTail = head;

        ListNode evenHead = head.next;
        ListNode evenTail = head.next;

        while (evenTail != null && evenTail.next != null) {

            oddTail.next = evenTail.next;
            oddTail = evenTail.next;

            evenTail.next = oddTail.next;
            evenTail = evenTail.next;
        }

        oddTail.next = evenHead;

        return oddHead;
    }

    // Print linked list
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

        // Creating:
        // 1 -> 2 -> 3 -> 4 -> 5 -> NULL

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Before:");
        printList(head);

        head = oddEvenList(head);

        System.out.println("After:");
        printList(head);
    }
}
