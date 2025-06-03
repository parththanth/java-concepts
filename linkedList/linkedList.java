package linkedList;

public class linkedList {
	public static class Node {
		// Node property
		int data;
		Node next;

		// constructor
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static class linkedlist {
		Node head = null;
		Node tail = null;

		void InsertAtTail(int val) {
			// for empty list
			// create new node and asign head and tail
			if (head == null) {
				Node newNode = new Node(val);
				head = newNode;
				tail = newNode;
			} else {
				// create new Node
				Node newNode = new Node(val);
				tail.next = newNode;
				tail = newNode;
			}
		}

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
		linkedlist ll = new linkedlist();
		ll.InsertAtTail(5);
		ll.display();
		ll.InsertAtTail(6);
		ll.display();
		ll.InsertAtTail(7);
		ll.display();
		ll.InsertAtTail(8);
		ll.display();

	}
}