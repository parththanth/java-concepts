package linkedList;
public class circularLinkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head = null, tail = null;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void delete(int key) {
        if (head == null) return;
        Node curr = head, prev = tail;
        do {
            if (curr.data == key) {
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        circularLinkedlist cll = new circularLinkedlist();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.display();
        cll.delete(2);
        cll.display();
    }
}
