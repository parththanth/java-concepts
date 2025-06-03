package linkedList;

public class insertAtHead {
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

		void insertAtHead(int val) {
			Node newNode = new Node(val);
			newNode.next = head;
			head = newNode;
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
		LinkedList ll = new LinkedList();
		ll.insertAtHead(5);
		ll.display();
		ll.insertAtHead(6);
		ll.display();
		ll.insertAtHead(7);
		ll.display();
		ll.insertAtHead(8);
		ll.display();
	}
}
