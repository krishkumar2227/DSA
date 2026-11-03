public class Q24_Reverse_K_Group {
  public class Main {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        if (len < k) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        for (int i = 1; i <= k; i++) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        ListNode recursionAns = reverseKGroup(curr, k);

        head.next = recursionAns;

        return prev;
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

    public static void main(String[] args) {

        // Creating Linked List
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        int k = 2;

        System.out.println("Original Linked List:");
        printList(head);

        head = reverseKGroup(head, k);

        System.out.println("After Reversing in Groups of " + k + ":");
        printList(head);
    }
}
}
