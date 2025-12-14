package Queues;
// public class Queues {

//     static class Queue{

//         static int arr[];
//         static int size ;
//         static int rear = -1;

//         Queue(int n){
//             this.arr = new int[n];
//             size = n;
//         }

//         public static boolean isEmpty(){
//             return rear == -1;
//         }

//         public static void enQueue(int data){
//             if(rear == size-1){
//                 System.out.println("the queue is full cannot add element into the queue1.");
//                 return;

//             }
//             rear++;
//             arr[rear]=data;
//             return;

//         }

//         public static int deQueue(){
//             if(isEmpty()){
//                     System.out.println("the queue is empty there are no elements to delete!..");

//                     return -1;

//             }
//             int front = arr[0];
//             for(int i = 0;i<rear;i++){

//                 arr[i]= arr[i+1];
//             }
//             rear--;
//         return front;
//     }
//      public static int peek(){
//         if(isEmpty()){
//                     System.out.println("the queue is empty there are no elements to delete!..");

//                     return -1;

//             }

//            return arr[0];

//     }
   
// }
// public static void main(String[] args) {
//         Queue obj = new Queue(6);
//         obj.enQueue(1);
//         obj.enQueue(2);
//         obj.enQueue(3);
//         obj.enQueue(4);
//         obj.enQueue(5);
//         obj.enQueue(6);
//         while (!obj.isEmpty()) {
//             System.out.println(obj.peek());
//              obj.deQueue();
//         }
       

//     }
   
    
// }

import java.util.*;
import java.util.Scanner;

public class Queues{
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
            Queue(int n){
                this.arr = new int[n];
                this.size = n;

            }

    public static boolean isEmpty(){
        return rear == -1;
    }

    public static void add(int data){
        if(rear == size-1){
            System.out.println("there is no space left to add the items!..");
            return;
        }
        rear++;
        arr[rear] = data;
        return;
    }

    public static int delt(){
        if(isEmpty()){
            System.out.println("there are no elements inside the Queue");
            return -1;
        }
        int front = arr[0];
        for(int i = 0;i<=rear;i++){
            arr[i] = arr[i+1];

        }
        rear--;
        return front;
    }

    public static int peek(){

        if(isEmpty()){
            System.out.println("there are no elements inside the queue to print");
            return -1;

        }
        return arr[0];
     }


    }
    public static void main(String[]args){
        int n = 6;
        Queue q = new Queue(n);
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter 1 to perform enqueue or 2 to dequeue and 3 to get peek value");
        int s = sc.nextInt();
        if(s == 1){
            System.out.println("enter how many elemente do you add");
            int k = sc.nextInt();
            if(k>=n){
                System.out.println("the size of the queuee is only "+n+"cant add this much element");
            }
            else {
                for(int i =0;i<=k;i++){
                    System.out.println("enter the elements");
                    int e = sc.nextInt();
                    q.add(e);
                }
            }

                while(!q.isEmpty()){
                    System.out.println(q.peek());
                     q.delt();


                }

        }
        else if(s== 2){
            q.delt();
        } 
        else{
                while(!q.isEmpty()){
                    System.out.println(q.peek());
                
                }
            }
    }
}