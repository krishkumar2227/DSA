

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
     head.prev=newNode;
     head=newNode;
     tail.next=head;
     head.prev=tail;
  }
  size++;
 }
 public void insertAtTail(int data){
  Node newNode=new Node(data);
  if(head==null){
    head=newNode;
    tail=newNode;

    head.prev=tail;
    tail.next=head;
  }else{
    newNode.prev=tail;
    newNode.next=head;

    tail.next=newNode;
    head.prev=newNode;
    tail=newNode;
  }
  size++;
 }
 public void insertAtPosition(int position,int data){
  if(position<1 || position>size+1){
    System.out.println("Invalid Position");
    return;
  }
  if(position==1){
    insertAtHead(data);
    return;
  }
  if(position==size+1){
    insertAtTail(data);
    return;
  }
  Node prevNode=head;
  Node newNode=new Node(data);
   for(int i =1;i<=position-2;i++){
     prevNode=prevNode.next;
   }
   prevNode.next=newNode;
   newNode.prev=prevNode;
   newNode.next=prevNode.next;
   prevNode.next=newNode;
   
   size++;
 }
  public void printForward(){
    if(head==null){
      System.out.println("Circular Doubly linked list is empty");
      return;
    }
    Node current=head;
    do { 
        System.out.println(current.data);
        current=current.next;
        if(current!=head){
          System.out.print("<-->");
        }
    } while (current!=head);
    System.out.println("<-->(Back to head");
  }
  public void printBackward(){
    if(tail==null){
      System.out.println("Circular Doubly Linked List is empty");
      return;
    }
    Node current=tail;
    do { 
        System.out.println(current.data);
        current=current.prev;
        if(current!=tail){
          System.out.println("<-->");
        }
    } while (current!=tail);
    System.out.println("<-->(Back to Tail)");
  }
  public boolean search(int target){
    if(head==null){
      return false;
    }
    Node temp=head; 
    do { 
        if(temp.data==target){
          return true;
        }else{
          temp=temp.next;
        }
    } while (temp!=head);
    return false;
  }
  public void deleteAtHead(){
    if(head==null){
      System.out.println("Circular Doubly Linked List is empty");
      return;
    }
    if(head==tail){
      head=null;
      tail=null;
      size=0;
      return;
    }
    Node temp=head;
    head=temp.next;
    tail.next=head;
    head.prev=tail;
    temp.next=null;
    temp.prev=null;
    size--;
  }
  public void deleteAtTail(){
    if(tail==null){
      System.out.println("Circular doubly Linked List is empty");
      return;
    }
    if(head==tail){
      head=null;
      tail=null;
      size=0;
      return;
    }
    Node prevNode=tail.prev;
    tail.next=null;
    tail.prev=null;
    tail=prevNode;
    tail.next=head;
    head.prev=tail;

    size--;
  }
  public void deleteAtPosition(int position){
    if(position<1 || position>size){
      System.out.println("Invalid Position");
      return;
    }
    if(position==1){
      deleteAtHead();
      return;
    }
    if(position==size){
      deleteAtTail();
      return;
    }
    Node current=head;
    for(int i =1;i<=position-2;i++){
      current=current.next;
    }
    Node previousNode=current.prev;
    Node nextNode=current.next;

    previousNode.next=nextNode;
    nextNode.prev=previousNode;
    current.prev=null;
    current.next=null;
    
    size--;
  }
}