public class Q15_Intersection_Of_Two_Linked_List {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Find length of list A
        int lenA = 0;
        ListNode tempA = headA;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        // Find length of list B
        int lenB = 0;
        ListNode tempB = headB;

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        // Move longer list ahead
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Find intersection
        while (headA != null && headB != null) {

            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public static void main(String[] args) {

        // Common part
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // List A
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        // List B
        ListNode headB = new ListNode(99);
        headB.next = common;

        // Find intersection
        ListNode result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection Node: " + result.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}

