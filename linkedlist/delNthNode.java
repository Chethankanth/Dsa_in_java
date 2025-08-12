import java.util.*;
public class delNthNode {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        return;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
        }
    //delete the nth node from the end of the linked list
    public void deleteNthFromEnd(int n){
        if(head == null || n <=0){
            System.out.println("Invalid operation: List is empty or n is not valid.");
            return;
        }

        int size = 0;
        Node curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        if(n > size){
            System.out.println("Invalid operation: n is greater than the size of the list.");
            return;
        }
        if(n== size){
            head = head.next;
            return;
        }
        int targetIndex = size-n;
        int i = 0;
        Node prev = head;
        while(i< targetIndex-1){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    public void isPalandrome(){
        if(head == null || head.next == null){
            System.out.println("List is empty or has only one element, hence it is a palindrome.");
            return;
        }

        Node curr = head;
        int size = 0;
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        curr = head;
        int i = 0;
        while(i<size/2){
            curr = curr.next;
            i++;
        }
            Node prev = null;
            while(curr!=null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node sedondHead = prev;
            Node p1= head;
            Node p2=sedondHead;
            while(p2!=null){
                if(p1.data != p2.data){
                    System.out.println("List is not a palindrome.");
                    return;
                }
                p1 = p1.next;
                p2 = p2.next;
                }
            System.out.println("List is a palindrome.");
            System.out.print("Reversed second half: ");
            Node print = prev;
             while (print != null) {
                 System.out.print(print.data + " -> ");
                    print = print.next;
                    }
                    System.out.println("null");
                }

    public void isCycle(){
        if(head == null){
            System.out.println("List is empty, hence no cycle.");
            return;
        }
        Node bunny = head;
        Node tortoise = head;
        while(bunny!= null && bunny.next!= null){
            bunny = bunny.next.next;
            tortoise = tortoise.next;
            
            if(bunny == tortoise){
                System.out.println("List has a cycle.");
                return;
            }
            System.out.println("List has no cycle.");

            
            }
              
        }
      
            
            
    
    public static void main(String[] args) {

        delNthNode list = new delNthNode();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(3);
        list.addNode(1);
        
        System.out.println("Original List:");
        list.printList();
        
        // int n = 2; // Delete the 2nd node from the end
        // list.deleteNthFromEnd(n);
        
        // System.out.println("List after deleting " + n + "th node from end:");
        // list.printList();

        list.isPalandrome();
        list.printList();
        list.isCycle();
        
    }
    
}
