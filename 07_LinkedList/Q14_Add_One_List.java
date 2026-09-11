public class Q14_Add_One_List {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    // Add one to number represented by linked list
    public static Node addOne(Node head) {

        // Reverse the list
        head = reverse(head);

        int carry = 1;
        Node curr = head;

        while (curr != null) {

            int nodeValue = curr.data;
            int sum = nodeValue + carry;

            int digit = sum % 10;
            curr.data = digit;

            // IMPORTANT: carry comes from sum
            carry = sum / 10;

            // If last node and carry is still left
            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
            }

            curr = curr.next;
        }

        // Reverse back
        head = reverse(head);

        return head;
    }

    // Print linked list
    public static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Example: 1 -> 2 -> 9
        // Number = 129
        // After adding one = 130

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(9);

        System.out.println("Before adding one:");
        printList(head);

        head = addOne(head);

        System.out.println("After adding one:");
        printList(head);
    }
}

