public class Q11_Print_the_Kth_Node_from_The_End {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Solution
    public static int getKthFromLast(Node head, int k) {

        Node prev = head;
        Node curr = head;

        // Move curr k nodes ahead
        for (int i = 1; i <= k; i++) {
            if (curr == null) {
                return -1;
            }
            curr = curr.next;
        }

        // Move both pointers
        while (curr != null) {
            curr = curr.next;
            prev = prev.next;
        }

        return prev.data;
    }

    // Main method
    public static void main(String[] args) {

        // 10 -> 5 -> 100 -> 5 -> 5
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(100);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(5);

        int k = 5;

        int answer = getKthFromLast(head, k);

        System.out.println("Kth node from last: " + answer);
    }
}
