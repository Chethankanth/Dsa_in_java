package Queues;
// import java.util.*;

// public class QueueUsing2Stacks {
//     static class Queue {
//         Stack<Integer> s1 = new Stack<>();
//         Stack<Integer> s2 = new Stack<>();

//         // Check if the queue is empty
//         public boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         // Enqueue (Add element to the end of the queue)
//         public void add(int data) {
//             s1.push(data);
//         }

//         // Dequeue (Remove element from the front of the queue)
//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             // Move all elements to s2 if s2 is empty
//             while (!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             int front = s2.pop();

//             // Move everything back to s1
//             while (!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }

//             return front;
//         }

//         // Peek (Return front element without removing it)
//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             while (!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             int front = s2.peek();

//             while (!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }

//             return front;
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         System.out.println("Peek: " + q.peek());   // Output: 1
//         System.out.println("Remove: " + q.remove()); // Output: 1
//         System.out.println("Remove: " + q.remove()); // Output: 2
//         System.out.println("Remove: " + q.remove()); // Output: 3
//         System.out.println("Remove: " + q.remove()); // Output: Queue is empty
//     }
// }

import java.util.*;

public class QueueUsing2Stacks{

    public static class Queues{
        static Stack<Integer>s1 = new Stack<>();
        static Stack<Integer>s2 = new Stack<>();


        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            if(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            if(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){

            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(isEmpty()){
                return -1;            
            }
            return s1.peek();
        }

        
    }

     public static void main(String[] args) {
            Queues q = new Queues();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
}