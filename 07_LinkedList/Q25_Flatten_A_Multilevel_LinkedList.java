// public class Q25_Flatten_A_Multilevel_LinkedList {
//     class Node{
//     int val;
//     Node prev;
//     Node next;
//     Node child;

//     Node(int val) {
//         this.val = val;
//         this.prev = null;
//         this.next = null;
//         this.child = null;
//     }
// }
//     public Node flatten(Node head) {
//         if (head == null) {
//             return head;
//         }

//         Node p = head;

//         while (p != null) {

//             if (p.child == null) {
//                 p = p.next;
//             } else {
//                 Node temp = p.child;

//                 while (temp.next != null) {
//                     temp = temp.next;
//                 }

//                 temp.next = p.next;

//                 if (p.next != null) {
//                     p.next.prev = temp;
//                 }

//                 p.next = p.child;
//                 p.child.prev = p;
//                 p.child = null;
//             }
//         }

//         return head;
//     }

//     public static void printList(Node head) {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {

//         Q25_Flatten_A_Multilevel_Linked_List obj =
//                 new Q25_Flatten_A_Multilevel_Linked_List();

//         Node head = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);
//         Node fourth = new Node(4);
//         Node fifth = new Node(5);

//         head.next = second;
//         second.prev = head;

//         second.next = third;
//         third.prev = second;

//         third.next = fourth;
//         fourth.prev = third;

//         fourth.next = fifth;
//         fifth.prev = fourth;

//         // Child list: 3 -> 6 -> 7
//         Node six = new Node(6);
//         Node seven = new Node(7);

//         six.next = seven;
//         seven.prev = six;

//         third.child = six;

//         head = obj.flatten(head);

//         System.out.println("Flattened Linked List:");
//         printList(head);
//     }
// }

