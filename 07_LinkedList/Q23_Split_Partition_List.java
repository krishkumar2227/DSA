public class Q23_Split_Partition_List{
    
static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public static ListNode[] splitListToParts(ListNode head, int k) {

    ListNode ans[] = new ListNode[k];

    ListNode temp = head;
    int len = 0;

    while (temp != null) {
        len++;
        temp = temp.next;
    }

    ListNode curr = head;
    ListNode prev = null;

    int baseSize = len / k;
    int extraNodes = len % k;

    for (int part = 0; part < k; part++) {

        if (curr == null) {
            ans[part] = curr;
            continue;
        }

        ans[part] = curr;

        int width = baseSize + (extraNodes > 0 ? 1 : 0);

        if (extraNodes > 0) {
            extraNodes--;
        }

        for (int i = 1; i <= width; i++) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        prev = null;
    }

    return ans;
}

public static void main(String[] args) {

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(7);
    head.next.next.next.next.next.next.next = new ListNode(8);
    head.next.next.next.next.next.next.next.next = new ListNode(9);
    head.next.next.next.next.next.next.next.next.next = new ListNode(10);

    int k = 3;

    ListNode[] result = splitListToParts(head, k);

    for (int i = 0; i < k; i++) {

        System.out.print("Part " + (i + 1) + ": ");

        ListNode curr = result[i];

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        System.out.println();
    }
}
}

