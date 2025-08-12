package Queues;
public class QueuesLl {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int delete() {
            if (isEmpty()) {
                System.out.println("There are no elements to delete from the queue!");
                return -1;
            }
            int val = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return val;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("There are no elements in the queue to peek.");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println("The peek value is " + q.peek());
            q.delete();
        }
    }
}