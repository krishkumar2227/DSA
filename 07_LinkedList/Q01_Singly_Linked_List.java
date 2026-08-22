//package 07_LinkedList;
public class Q01_Singly_Linked_List {
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

  //constructor
  public Q01_Singly_Linked_List(){
    this.head=null;
    this.tail=null;
    this.size=0;
  }
  public void insertAtHead(int data){
    Node newNode=new Node(data);

    if(head==null && tail==null){
      head=newNode;
      tail=newNode;
    }else{
      newNode.next=head;
      head=newNode;
    }
    size++;
  }
  public void insertAtTail(int data){
    Node newNode= new Node(data);
    if(head == null && tail==null){
      head=newNode;
      tail=newNode;
    }else{
      tail.next=newNode;
      tail=newNode;
    }
    size++;
  }
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
    newNode.next=prevNode.next;
    prevNode.next=newNode;
    size++;
  }
  public boolean isEmpty(){
    return head==null;
  }
  public int getSize(){
    return size;
  }
  public void printList(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Q01_Singly_Linked_List myList=new Q01_Singly_Linked_List();
    if(myList.isEmpty()){
      System.out.println("List is Empty.");
    }
    System.out.println("Size of LL:" +myList.getSize());

    myList.insertAtHead(10);
    myList.printList();
    myList.insertAtHead(20);
    myList.printList();
    myList.insertAtHead(30);
    myList.printList();
    myList.insertAtHead(40);
    myList.printList();
  }
}
