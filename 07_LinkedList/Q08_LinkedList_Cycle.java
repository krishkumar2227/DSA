public class Q08_LinkedList_Cycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            fast = fast.next;

            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Creating linked list:
        // 1 -> 2 -> 3 -> 4
        //           ^    |
        //           |____|
        
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating cycle: 4 -> 3
        fourth.next = third;

        Q08_LinkedList_Cycle obj = new Q08_LinkedList_Cycle();

        System.out.println(obj.hasCycle(head));
    }
}

