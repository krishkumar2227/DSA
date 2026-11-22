import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Q30_Remove_Duplicates_From_List {

    public static ListNode deleteDuplicates(ListNode head) {

        HashMap<Integer, Integer> map = new HashMap<>();

        ListNode temp = head;

        while (temp != null) {
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        temp = head;

        while (temp != null) {

            if (map.get(temp.val) == 1) {
                tail.next = new ListNode(temp.val);
                tail = tail.next;
            }

            temp = temp.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        ListNode result = deleteDuplicates(head);

        System.out.println("After Removing Duplicates:");
        printList(result);
    }
}