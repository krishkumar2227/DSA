public class Q18_Delete_M_Nodes_After_N_Node{
// Node class
static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Delete N nodes after keeping M nodes
static void linkDelete(Node head, int m, int n) {

    if (head == null || m == 0) {
        return;
    }

    Node curr = head;
    Node prev = null;

    while (curr != null) {

        // Keep M nodes
        for (int i = 1; i <= m && curr != null; i++) {
            prev = curr;
            curr = curr.next;
        }

        // If no nodes remain, stop
        if (curr == null) {
            return;
        }

        // Delete N nodes
        for (int i = 1; i <= n && curr != null; i++) {
            curr = curr.next;
        }

        // Connect remaining list
        prev.next = curr;
    }
}

// Print linked list
static void printList(Node head) {
    Node curr = head;

    while (curr != null) {
        System.out.print(curr.data + " -> ");
        curr = curr.next;
    }

    System.out.println("null");
}

// Main method
public static void main(String[] args) {

    // Create linked list
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = new Node(6);
    head.next.next.next.next.next.next = new Node(7);
    head.next.next.next.next.next.next.next = new Node(8);

    System.out.println("Original Linked List:");
    printList(head);

    // M = nodes to keep, N = nodes to delete
    int m = 2;
    int n = 2;

    linkDelete(head, m, n);

    System.out.println("Linked List After Deletion:");
    printList(head);
}

}

