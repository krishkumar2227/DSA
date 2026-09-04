public class Q09_Merge_Two_SortedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode ansHead = dummy;
        ListNode ansTail = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                ansTail.next = list1;
                list1 = list1.next;
                ansTail = ansTail.next;
            } 
            else {
                ansTail.next = list2;
                list2 = list2.next;
                ansTail = ansTail.next;
            }
        }

        if (list1 != null) {
            ansTail.next = list1;
        }

        if (list2 != null) {
            ansTail.next = list2;
        }

        ansHead = ansHead.next;
        dummy.next = null;

        return ansHead;
    }

    // Function to print Linked List
    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // List 1: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // List 2: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        Q09_Merge_Two_SortedList obj = new Q09_Merge_Two_SortedList();

        ListNode ans = obj.mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(ans);
    }
}

