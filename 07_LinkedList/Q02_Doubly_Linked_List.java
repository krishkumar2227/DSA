public class Q02_Doubly_Linked_List {
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
  
   public Q02_Doubly_Linked_List(){
    this.head=null;
    this.tail=null;
    this.size=0;
  }
  //insertAtHead:
  public void insetAtHead(int data){
    Node newNode= new Node(data);
    if(head==null && tail==null){
      head=newNode;
      tail=newNode;
    }else{
      newNode.next=head;
      head.prev=newNode;
      head=newNode;
    }
    size++;
  }

  //insertAtTail:
  public void insertAtTail(int data){
    Node newNode= new Node(data);
    if(head==null && tail==null){
      head=newNode;
      tail=newNode;
    }else{
      newNode.prev=tail;
      tail.next=newNode;
      tail=newNode;
    }
    size++;
  }

  //insertAtPosition:
  public void insertAtPosition(int position,int data){
    if(position<1 || position>size+1){
      System.out.println("Invalid Position to insert Node");
      return ;
    }
    if(position==1){
      insetAtHead(data);
      return;
    }
    if(position==size+1){
      insertAtTail(data);
      return;
    }
    Node  temp=head;
    for(int i =0;i<=position-2;i++){
       temp=temp.next;
    }
    Node prevNode=temp;
    Node nextNode=prevNode.next;
    Node currNode= new Node(data);

    currNode.prev=prevNode;
    prevNode.next=currNode;
    currNode.next=nextNode;
    nextNode.prev=currNode;

    size++;
  }

  //printList:
  public void printList(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println();
  }
  
  //printListBackward:
  public void printBackward(){
    Node temp=tail;
    while(temp!=null){
      System.out.print("<--" + temp.data);
      temp=temp.prev;
    }
    System.out.println();
  }

  //searchInLinkedList:
  public boolean searchInLL(int target){
    if(head==null){
      System.out.println("No nodes is present:");
      return false;
    }
    Node temp=head;
    while(temp!=null){
      if(temp.data==target){
        return true;
      }else{
        temp=temp.next;
      }
    }
  return false;
  }

  //updateValue:
  public void updateValue(int oldValue,int newValue){
    if(head==null){
      System.out.println("No nodes is present:");
      return;
    }
    Node temp=head;
    while(temp!=null){
      if(temp.data==oldValue){
        temp.data=newValue;
      }else{
        temp=temp.next;
      }
    }
  }

  //deleteAtHead:
  public void deleteAtHead(){
    if(head==null){
      System.out.println("No node is Present:");
      return ;
    }
    if(head==tail){
      head=null;
      tail=null;
      size=0;
      return;
    }
    head=head.next;
    head.prev=null;
    size--;
  }
  
  //deleteAtTail:
  public void deleteAtTail(){
    if(head==null){
      System.out.println("No node is Present:");
      return ;
    }
    if(head==tail){
      head=null;
      tail=null;
      size=0;
      return;
    }
    Node currNode=tail;
    Node prevNode=tail.prev;

    prevNode.next=null;
    currNode.prev=null;
    tail=prevNode;
    size--;
  }
  public void deleteAtPosition(int position){
     if(position < 1 || position > size+1){
        System.out.println("Invalid Position:");
        return ;
     }
     if(position==1){
      deleteAtHead();
      return ;
     }
     if(position==size+1){
       deleteAtTail();
       return;
     }
     Node currNode=head;
     for(int i =0;i<=position-1;i++){
      currNode=currNode.next;
     }
     Node prevNode=currNode.prev;
     Node nextNode=currNode.next;

     prevNode.next=nextNode;
     nextNode.prev=prevNode;
     currNode.prev=null;
     currNode.next=null;

     size--;
  }
  public static void main(String[] args) {
  Q02_Doubly_Linked_List myList= new Q02_Doubly_Linked_List();
  myList.insetAtHead(10);
  myList.printList();

  myList.insetAtHead(20);
  myList.printList();

  myList.insetAtHead(30);
  myList.printList();

  myList.insertAtTail(100);
  myList.printList();

  myList.insertAtTail(30);
  myList.printList();

  myList.insertAtTail(120);
  myList.printList();

  myList.insertAtPosition(3, 500);
  myList.printList();

  //myList.printBackward();
  
  // System.out.println("Found or not:" + myList.searchInLL(500));

  // myList.updateValue(30, 800);
  // myList.printList();

  myList.deleteAtHead();
  myList.printList();

  myList.deleteAtTail();
  myList.printList();

  myList.deleteAtPosition(3);
  myList.printList();
  }
}
