import java.util.*;
public class Ll {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
              head = newNode;
            
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void deleteFront() {
        if (head == null) {
            System.out.println("No elements to delete at the front!");
            return;
        }
        head = head.next;
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("No elements to delete at the end!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr.next != null) {
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = null;
    }

    public void reverseIterate() {
        if (head == null || head.next == null) return;

        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) return head;

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public Node deleteFromLastNode(Node head, int n) {
        if (head == null || n <= 0) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i <= n; i++) {
            if (fast == null) return head;
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node findMid(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node mid = findMid(head);
        Node secondHalfStart = reverseList(mid.next);

        Node p1 = head;
        Node p2 = secondHalfStart;
        boolean isPalin = true;

        while (p2 != null) {
            if (p1.data != p2.data) {
                isPalin = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Optional: Restore original list
        mid.next = reverseList(secondHalfStart);

        return isPalin;
    }

    public boolean hasCycle(Node head) {
        if (head == null) return false;

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Ll list = new Ll();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        list.printList();

        // Uncomment for testing specific functionality:
        // list.deleteFront();
        // list.deleteEnd();
        // list.reverseIterate();
        // list.head = list.reverseRecursive(list.head);
        // list.head = list.deleteFromLastNode(list.head, 2);
        System.out.println("Is Palindrome: " + list.isPalindrome(list.head));
        list.printList();
    }
}