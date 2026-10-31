public class Q20_LinkedList_Cycle_Two {
static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public ListNode detectCycle(ListNode head) {

    ListNode slow = head;
    ListNode fast = head;

    boolean hasCycle = false;

    // Step 1: Detect Cycle
    while (fast != null && fast.next != null) {

        fast = fast.next.next;
        slow = slow.next;

        if (fast == slow) {
            hasCycle = true;
            break;
        }
    }

    if (hasCycle == false) {
        return null;
    }

    // Step 2: Find Starting Node
    slow = head;

    while (slow != fast) {
        fast = fast.next;
        slow = slow.next;
    }

    ListNode startingNode = slow;

    return startingNode;
}

public static void main(String[] args) {

    // Creating Linked List
    ListNode head = new ListNode(3);
    head.next = new ListNode(2);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(-4);

    // Creating Cycle (Tail connects to node 2)
    head.next.next.next.next = head.next;

    Q20_LinkedList_Cycle_Two obj = new Q20_LinkedList_Cycle_Two();

    ListNode result = obj.detectCycle(head);

    if (result != null) {
        System.out.println("Cycle starts at node: " + result.val);
    } else {
        System.out.println("No cycle found");
    }
}

}

