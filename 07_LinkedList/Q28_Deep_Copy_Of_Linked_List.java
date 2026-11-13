public class Q28_Deep_Copy_Of_Linked_List {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    static class Solution {

        public Node copyRandomList(Node head) {

            if (head == null) {
                return null;
            }

            // Step 1: Insert cloned nodes
            Node temp = head;

            while (temp != null) {
                Node cloneNode = new Node(temp.val);

                cloneNode.next = temp.next;
                temp.next = cloneNode;

                temp = cloneNode.next;
            }

            // Step 2: Assign random pointers
            temp = head;

            while (temp != null) {
                Node oldNode = temp;
                Node newNode = temp.next;

                if (oldNode.random != null) {
                    newNode.random = oldNode.random.next;
                }

                temp = newNode.next;
            }

            // Step 3: Separate both linked lists
            temp = head;
            Node ansListHead = head.next;

            while (temp != null) {
                Node oldNode = temp;
                Node newNode = temp.next;

                oldNode.next = newNode.next;

                if (newNode.next != null) {
                    newNode.next = newNode.next.next;
                }

                temp = temp.next;
            }

            return ansListHead;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);

        // Random pointers
        head.random = null;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;

        Solution obj = new Solution();

        Node copiedHead = obj.copyRandomList(head);

        // Print cloned linked list
        Node temp = copiedHead;

        System.out.println("Cloned Linked List:");

        while (temp != null) {

            System.out.print("Value: " + temp.val);

            if (temp.random != null) {
                System.out.println(", Random: " + temp.random.val);
            } else {
                System.out.println(", Random: null");
            }

            temp = temp.next;
        }
    }
}