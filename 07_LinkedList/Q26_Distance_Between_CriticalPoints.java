import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Q26_Distance_Between_CriticalPoints {

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if (head == null) {
            return new int[]{-1, -1};
        }

        ListNode prev = head;
        ListNode curr = head.next;

        List<Integer> criticalPoints = new ArrayList<>();
        int i = 1;

        while (curr != null && curr.next != null) {

            if (curr.val > prev.val && curr.val > curr.next.val) {
                criticalPoints.add(i);
            }

            if (curr.val < prev.val && curr.val < curr.next.val) {
                criticalPoints.add(i);
            }

            prev = prev.next;
            curr = curr.next;
            i++;
        }

        if (criticalPoints.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDist = Integer.MAX_VALUE;

        for (int j = 1; j < criticalPoints.size(); j++) {
            minDist = Math.min(minDist,
                    criticalPoints.get(j) - criticalPoints.get(j - 1));
        }

        int maxDist = criticalPoints.get(criticalPoints.size() - 1)
                - criticalPoints.get(0);

        return new int[]{minDist, maxDist};
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Q26_Distance_Between_CriticalPoints obj =
                new Q26_Distance_Between_CriticalPoints();

        // Creating Linked List
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);

        System.out.println("Linked List:");
        printList(head);

        int[] ans = obj.nodesBetweenCriticalPoints(head);

        System.out.println("Minimum Distance: " + ans[0]);
        System.out.println("Maximum Distance: " + ans[1]);
    }
}

