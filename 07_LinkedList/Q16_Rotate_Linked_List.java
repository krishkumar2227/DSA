public class Q16_Rotate_Linked_List {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node rotate(Node head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and last node
        Node temp = head;
        int len = 1;

        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        // If k is greater than length
        k = k % len;

        // No rotation needed
        if (k == 0) {
            return head;
        }

        // Make circular linked list
        temp.next = head;

        // Reach the node just before new head
        temp = head;

        for (int i = 1; i < len - k; i++) {
            temp = temp.next;
        }

        // New head
        Node forward = temp.next;

        // Break the circle
        temp.next = null;

        return forward;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original:");
        printList(head);

        int k = 2;

        head = rotate(head, k);

        System.out.println("After rotation:");
        printList(head);
    }
}

