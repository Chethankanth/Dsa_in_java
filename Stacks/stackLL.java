import java.util.*;

public class stackLL {
    public static Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        static class StackLL{

        public static boolean isNull(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isNull()){
                head = newNode;
                return;
            }
    
                newNode.next = head;
                head = newNode;
            
        }

        public static int pop(){
            if(isNull()){
                System.out.println("Stack is empty, cannot pop!");
                return -1;
            };
            int popedData = head.data;
            head = head.next;
            return popedData;
        }

        public static int peel(){
            if(isNull()){
                System.out.println("Stack is empty, cannot peel!");
                return -1; // or throw an exception
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stackLL.StackLL.push(1);// THIS IS also possible because of static and inner class
        StackLL stack = new StackLL();
        stack.push(3);
        stack.push(3);
        stack.push(4);

        while(!stack.isNull()){
            System.out.println(stack.peel());
            stack.pop();

        }
        
    }
    
}
