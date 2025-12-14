import java.util.*;

public class LinkedList {
    Node head;

    

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
// LinkedList class to manage the linked list
    public void insertFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        return;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        return;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        else{
            Node curr = head;
            while(curr!=null){
                System.out.print(curr.data+ " -> ");
                curr = curr.next;
            }
        }
        System.out.println("NULL");
    }

    public Node deleteFront(){
        if(head == null){
            System.out.println("No elements to delete at the front!");
            return null ;
        }
        else{
            Node temp = head;
            head = head.next;
            return temp;
        }
    }

    public Node deleteEnd(){
        if(head == null){
            System.out.println("No elements to delete at the end!");
            return null;
        }
        else if(head.next == null){
            Node temp = head;
            head = null;
            return temp;
        }
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
        return curr;
    }

    // public Node deleteNode(int index){
    //     if(head == null || index<0){
    //         System.out.println("Invalid index or empty list!");
    //         return null;    

    //     }
    //     else if(index == 0){
    //         return deleteFront();
    //     }
    //     else if(index == 1){
    //         return deleteEnd();
    //     }
    //     else{
    //         Node curr = head;
    //         for(int i = 0; i<index-1 && curr !=null;i++){
    //             curr = curr.next;
    //         }
    //         if(curr == null || curr.next == null){
    //             System.out.println("Index out of bounds!"  );
    //         }
    //         else{
    //             Node temp = curr.next;
    //             curr.next = temp.next;
    //             return temp;    
    //         }
    //     }
    // }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prev =head;
        Node curr = head.next;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    // recursion using

   public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
        

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertEnd(1);
       list.insertEnd(2);
        list.insertEnd(3);
         list.insertEnd(4);
          list.insertEnd(5);
           list.insertEnd(6);
            list.insertEnd(7);
        // list.insertFront(0);

        list.printList();

    //     Node deletedNode = list.deleteFront();
    //     if (deletedNode != null) {
    //         System.out.println("Deleted from front: " + deletedNode.data);
    //     }
    //     list.printList();

    //     deletedNode = list.deleteEnd();
    //     if (deletedNode != null) {
    //         System.out.println("Deleted from end: " + deletedNode.data);
    //     }
    //     list.printList();
        // list.reverseIterate();
      
        list.head = list.reverseRecursive(list.head);
        list.printList();
        
        
    }

    
    
}
