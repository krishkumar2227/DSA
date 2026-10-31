public class Q21_Partition_List {
static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public ListNode partition(ListNode head, int x) {

    ListNode lessHead = new ListNode(-1);
    ListNode lessTail = lessHead;

    ListNode greaterHead = new ListNode(-1);
    ListNode greaterTail = greaterHead;

    ListNode temp = head;

    while (temp != null) {

        if (temp.val < x) {

            ListNode nodeToInsert = temp;
            temp = temp.next;
            nodeToInsert.next = null;

            lessTail.next = nodeToInsert;
            lessTail = nodeToInsert;

        } else {

            ListNode nodeToInsert = temp;
            temp = temp.next;
            nodeToInsert.next = null;

            greaterTail.next = nodeToInsert;
            greaterTail = nodeToInsert;
        }
    }

    lessTail.next = greaterHead.next;
    greaterTail.next = null;

    lessHead = lessHead.next;

    return lessHead;
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

    // Creating Linked List
    ListNode head = new ListNode(1);
    head.next = new ListNode(4);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(2);

    int x = 3;

    System.out.println("Original Linked List:");
    printList(head);

    Q21_Partition_List obj = new Q21_Partition_List();

    ListNode result = obj.partition(head, x);

    System.out.println("After Partition:");
    printList(result);
}
}