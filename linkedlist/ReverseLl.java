
import java.util.*;


public class ReverseLl {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
    
        }
    }

        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            System.out.printf("new node added succesfully \n",data);
            return;
        }
        public void addEnd(String data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
            System.out.println("new node added at the end succesfully");
            return;
        }

        public void reverseItterate(){
            if(head == null || head.next ==null){
                return;
            }

            Node prev = head;
            Node curr = head.next;
            while(curr.next!=null){
                    Node next = curr.next;
                    curr.next = prev;

                    //update
                    prev = curr;
                    curr = next;
            }
            head.next = null;
            head = prev;
        }
        public void printList(){
           
            if(head == null){
                System.out.println("there are no elements in the linked list to print the output!!..");
                return;

            }
            Node currNode = head;
            System.out.println("the linked list is given below: ");
            while(currNode.next!=null){
                
                System.out.println(currNode.data+" -> ");
                currNode = currNode.next;
            }
            System.out.println("NULL");
            return;
        }
        
        public static void main(String []args){
       ReverseLl list = new ReverseLl();
            list.addFirst("a");
            list.addEnd("b");
            list.addFirst("c");
            list.printList();
            list.reverseItterate();
            list.printList();
            return;

    
        }

    

    
    
}

