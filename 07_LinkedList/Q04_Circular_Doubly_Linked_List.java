public class Q04_Circular_Doubly_Linked_List{
  static class Node{
    int data;
    Node next;
    Node prev;
    //constructor
    Node(int data){
      this.data=data;
      this.next=null;
      this.prev=null;
    }
  }
  private Node head;
  private Node tail;
  private int size;
  
   public Q04_Circular_Doubly_Linked_List(){
    this.head=null;
    this.tail=null;
    this.size=0;
  }
  //insertAtHead:
  public void insertAtHead(int data){
  Node newNode=new Node(data);
  if(head==null){
    head=newNode;
    tail=newNode;

    head.prev=tail;
    tail.next=head;
  }else{
     newNode.next=head;
     newNode.prev=tail;
  }
 }
 public void insertAtTail(int data){
  Node newNode=new Node(data);
  if(head==null){
    head=newNode;
    tail=newNode;
  }
 }
}