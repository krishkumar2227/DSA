public class Q03_Circular_Singly_Linked_List {
   static class Node{
    int data;
    Node next;
    //constructor
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  private Node head;
  private Node tail;
  private int size;
  
   public Q03_Circular_Singly_Linked_List(){
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
      tail.next=head;
    }else{
      newNode.next=head;
      head=newNode;
      tail.next=head;
    }
    size++;
  }

  //insertAtTail:
  public void insertAtTail(int data){
    Node newNode= new Node(data);
    if(head == null && tail==null){
      head=newNode;
      tail=newNode;
      tail.next=head;
    }else{
      tail.next=newNode;
      tail=newNode;
      tail.next=head;
    }
    size++;
  }
  //insertAtPosition:
  public void insertAtPosition(int position,int data){
    if(position < 1 || position>size+1){
       System.out.println("Insertion Not possible.");
       return ;
    }
    if(position == 1){
      insertAtHead(data);
      return ;
    }
    if(position == size+1){
      insertAtTail(data);
      return ;
    }
    Node prevNode=head;
    for(int i=1;i<=position-2;i++){
      prevNode=prevNode.next;
    }

    Node newNode=new Node(data);

    Node currNode=newNode;
    Node nextNode=prevNode.next;
    prevNode.next=currNode;
    currNode.next=nextNode;
    size++;
  }
  //printList:
  public void printList(){
    if(head==null){
      System.out.println("Circular Singly Linked List is empty:");
      return;
    }
    Node current=head;
    do { 
        System.out.println(current.data + " --> ");
        current=current.next;
    } while (current!=head);
      System.out.println("(Back to Head)");
  }
  //searching:
  public boolean search(int target){
   if(head==null){
     return false;
    }
    Node current=head;
    do { 
        if(current.data==target){
          return true;
        }
        current = current.next;
    } while (current!=head);
      return false;
  }

  //deleteAtHead:
  public void deleteAtHead(){
    if(head==null){
      System.out.println("Circular linked list is empty:");
      return;
    }
    if(head==tail){
      head=null;
      tail=null;
      size=0;
      return;
    }
    Node temp=head;

    head=head.next;
    tail.next=head;
    temp.next=null;

    size--;
  }
  //deleteAtTail:
  public void deleteAtTail(){
    if(head==null){
      System.out.println("Circular linked list is empty:");
      return;
    }
    if(head==tail){
      head=null;
      tail=null;
      size=0;
      return;
    }
    Node current=head;
    while(current.next!=tail){
      current=current.next;
    }
    Node temp=tail;
    tail=current;
    tail.next=head;
    temp.next=null;
    
    size--;
  } 
  //deleteAtPosition:
  public void deleteAtPosition(int position){
    if(position<1 || position>size+1){
      System.out.println("Invalid Position");
      return;
    }
    if(position ==1){
      deleteAtHead();
      return;
    }
    if(position == size+1){
      deleteAtTail();
      return ;
    }
    Node prevNode = head;
    for(int i =1;i<=position-2;i++){
      prevNode=prevNode.next;
    }
    Node currNode= prevNode.next;
    Node nextNode=currNode.next;

    prevNode.next=nextNode;
    currNode.next=null;

    size--;
  }
}


