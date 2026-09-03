import java.util.Scanner;
public class Q07_Check_Palindrome_LinkedList {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Find middle point
    public static ListNode midPoint(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            fast = fast.next;

            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }

        return slow;
    }

    // Reverse linked list
    public static ListNode reverseLL(ListNode head) {

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

    // Check palindrome
    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode list2 = midPoint(head);

        // Find node just before middle
        ListNode temp = head;

        while (temp.next != list2) {
            temp = temp.next;
        }

        // Break the list into two parts
        temp.next = null;

        // Reverse second half
        ListNode head2 = reverseLL(list2);

        // Compare both halves
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while (temp1 != null && temp2 != null) {

            if (temp1.val != temp2.val) {
                return false;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }

    // Print linked list
    public static void printLL(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Empty list");
            return;
        }

        System.out.println("Enter " + n + " values:");

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Linked List: ");
        printLL(head);

        boolean result = isPalindrome(head);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}

