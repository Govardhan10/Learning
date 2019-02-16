import java.util.Scanner;

public class LinkedListImpl {
  public static void main(String args[]) {
    System.out.println("Creating a Linked list");
     Link head = new Link(5);
     add(head,6);
     add(head,7);
     add(head,8);
     add(head,0);
     printList(head);
  }

  private static void add(Link head,int data) {
    while(head.pointer!= null){
      head = head.pointer;
    }
    Link newLink = new Link(data);
    head.pointer = newLink;
  }

  private static void printList(Link head) {
    while(head!= null){
      System.out.println(head.data);
      head = head.pointer;
    }
  }
}
