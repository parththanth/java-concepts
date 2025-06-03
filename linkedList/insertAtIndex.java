package linkedList;

public class insertAtIndex {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head = null;

        // Insert at head
        void insertAtHead(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }

        // Insert at any index
        void insertAtIndex(int index, int val) {
            if (index < 0) {
                System.out.println("Invalid index");
                return;
            }
            if (index == 0) {
                insertAtHead(val);
                return;
            }

            Node temp = head;
            int count = 0;

            // Traverse to node before index
            while (temp != null && count < index - 1) {
                temp = temp.next;
                count++;
            }

            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }

            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // Display list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtHead(5);
        ll.insertAtHead(6);
        ll.insertAtHead(7);
        ll.insertAtHead(8);
        ll.display(); // 8 7 6 5

        ll.insertAtIndex(2, 99); // Insert 99 at index 2
        ll.display(); // 8 7 99 6 5

        ll.insertAtIndex(0, 100); // Insert 100 at head
        ll.display(); // 100 8 7 99 6 5

        ll.insertAtIndex(10, 77); // Invalid index
    }
}
