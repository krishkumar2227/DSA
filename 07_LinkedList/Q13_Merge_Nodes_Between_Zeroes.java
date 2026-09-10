public class Q13_Merge_Nodes_Between_Zeroes {
    // ListNode class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeNodes(ListNode head) {

        ListNode ansHead = null;
        ListNode ansTail = null;

        ListNode temp = head.next;

        int sum = 0;

        while (temp != null) {

            if (temp.val != 0) {
                sum = sum + temp.val;
            } 
            else {

                ListNode newNode = new ListNode(sum);

                if (ansHead == null) {
                    ansHead = newNode;
                    ansTail = newNode;
                } 
                else {
                    ansTail.next = newNode;
                    ansTail = newNode;
                }

                sum = 0;
            }

            temp = temp.next;
        }

        return ansHead;
    }

    // Print Linked List
    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Input:
        // 0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 0

        ListNode head = new ListNode(0);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(0);

        System.out.println("Original List:");
        printList(head);

        ListNode ans = mergeNodes(head);

        System.out.println("Answer List:");
        printList(ans);
    }
}

