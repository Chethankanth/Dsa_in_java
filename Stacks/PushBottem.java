import java.util.*;

public class PushBottem {

    static class arrlist {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        public static void pushAtBottom(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }

            int top = pop();
            pushAtBottom(data);
            push(top);
        }

        public static void reverse() {
            if (isEmpty()) {
                return;
            }

            int val = pop();
            reverse();
            pushAtBottom(val);
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public static void printStack() {
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        arrlist.push(1);
        arrlist.push(2);
        arrlist.push(3);
        arrlist.push(4);

        System.out.println("Initial Stack:");
        arrlist.printStack();

        arrlist.pushAtBottom(0);
        System.out.println("\nStack after pushing 0 at bottom:");
        arrlist.printStack();

        arrlist.reverse();
        System.out.println("\nStack after reversing:");
        arrlist.printStack();
    }
}