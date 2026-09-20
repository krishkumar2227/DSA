//import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q17_Swap_Nodes {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;

        // kth node from beginning
        for (int i = 1; i <= k - 1; i++) {
            first = first.next;
        }

        // Find kth node from end
        ListNode temp = first.next;
        ListNode second = head;

        while (temp != null) {
            temp = temp.next;
            second = second.next;
        }

        // Swap values
        int tempValue = first.val;
        first.val = second.val;
        second.val = tempValue;

        return head;
    }

    // Print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Before swapping:");
        printList(head);

        int k = 2;

        head = swapNodes(head, k);

        System.out.println("After swapping:");
        printList(head);
    }
}
