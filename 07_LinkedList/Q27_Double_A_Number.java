
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Q27_Double_A_Number {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {

        head = reverse(head);

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        ListNode temp = head;

        int carry = 0;

        while (temp != null) {

            int data = temp.val;
            int sum = data + data + carry;
            int digit = sum % 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            carry = sum / 10;

            temp = temp.next;
        }

        if (temp == null && carry != 0) {
            curr.next = new ListNode(carry);
        }

        dummy = dummy.next;

        head = reverse(dummy);

        return head;
    }

    // Print Linked List
    public void printList(ListNode head) {
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

        Q27_Double_A_Number obj = new Q27_Double_A_Number();

        // Input: 1 -> 8 -> 9
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);

        System.out.println("Original Linked List:");
        obj.printList(head);

        head = obj.doubleIt(head);

        System.out.println("After Doubling:");
        obj.printList(head);
    }
}
