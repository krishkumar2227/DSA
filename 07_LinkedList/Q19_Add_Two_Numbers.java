public class Q19_Add_Two_Numbers {
// Definition of Linked List Node
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Add two numbers represented by linked lists
static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    int carry = 0;

    ListNode ansHead = new ListNode(-1);
    ListNode ansTail = ansHead;

    while (l1 != null || l2 != null || carry != 0) {

        int sum = 0;

        if (l1 != null) {
            sum = sum + l1.val;
            l1 = l1.next;
        }

        if (l2 != null) {
            sum = sum + l2.val;
            l2 = l2.next;
        }

        sum = sum + carry;

        int digit = sum % 10;

        ListNode newNode = new ListNode(digit);

        ansTail.next = newNode;
        ansTail = newNode;

        carry = sum / 10;
    }

    ansHead = ansHead.next;

    return ansHead;
}

// Print linked list
static void printList(ListNode head) {
    ListNode curr = head;

    while (curr != null) {
        System.out.print(curr.val);

        if (curr.next != null) {
            System.out.print(" -> ");
        }

        curr = curr.next;
    }

    System.out.println();
}

// Create a linked list from an array
static ListNode createList(int[] arr) {

    if (arr.length == 0) {
        return null;
    }

    ListNode head = new ListNode(arr[0]);
    ListNode tail = head;

    for (int i = 1; i < arr.length; i++) {
        tail.next = new ListNode(arr[i]);
        tail = tail.next;
    }

    return head;
}

public static void main(String[] args) {

    // First number: 342 (stored in reverse order)
    ListNode l1 = createList(new int[]{2, 4, 3});

    // Second number: 465 (stored in reverse order)
    ListNode l2 = createList(new int[]{5, 6, 4});

    System.out.println("First Number (reverse order):");
    printList(l1);

    System.out.println("Second Number (reverse order):");
    printList(l2);

    ListNode result = addTwoNumbers(l1, l2);

    System.out.println("Result (reverse order):");
    printList(result);
}
}

