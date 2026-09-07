//import java.lang.classfile.components.ClassPrinter.ListNode;

public class Q10_Remove_Duplicates_In_SortedList {
   static  class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {

            if (prev.val != curr.val) {
                prev = prev.next;
                curr = curr.next;
            } 
            else {
                prev.next = curr.next;
                curr = curr.next;
            }
        }

        return head;
    }

    // Print Linked List
    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Creating sorted linked list:
        // 1 -> 1 -> 2 -> 3 -> 3 -> 4

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);

        System.out.println("Before deleting duplicates:");
        printList(head);

        head = deleteDuplicates(head);

        System.out.println("After deleting duplicates:");
        printList(head);
    }
}

