public class Q22_Remove_Element {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);
        ListNode dummyTail = dummyHead;

        ListNode temp = head;

        while (temp != null) {

            if (temp.val != val) {

                ListNode nodeToInsert = temp;
                temp = temp.next;

                nodeToInsert.next = null;

                dummyTail.next = nodeToInsert;
                dummyTail = nodeToInsert;

            } else {
                temp = temp.next;
            }
        }

        dummyHead = dummyHead.next;
        return dummyHead;
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

        // Creating Linked List: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;

        System.out.println("Original Linked List:");
        printList(head);

        head = removeElements(head, val);

        System.out.println("After Removing " + val + ":");
        printList(head);
    }
}

