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
    
  }
  public static void main(String[] args) {
    
  }
}
