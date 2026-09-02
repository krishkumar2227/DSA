public class Q06_Find_Mid_Node_Of_LinkedList{
  static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode middleNode(ListNode head) {

        ListNode temp = head;
        int count = 0;

        // Count total nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Find middle position
        int mid = count / 2;

        ListNode len = head;

        // Move to middle node
        for (int i = 1; i <= mid; i++) {
            len = len.next;
        }

        return len;
    }

    public static void main(String[] args) {

        // Create linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Find middle
        ListNode result = middleNode(head);

        System.out.println("Middle node: " + result.val);
    }
}