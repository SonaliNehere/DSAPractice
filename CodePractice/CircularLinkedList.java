package Practice;

class Node1 {
	int val;
	Node1 next;

	Node1(int val) {
		this.val = val;
		this.next = null;
	}
}

public class CircularLinkedList {

	static Node1 head;
	// 0 1 2 3 4

	public static void insertAtHead(int val) {
		Node1 newNode = new Node1(val);

		if (head == null) {
			head = newNode;
			head.next = head;
			return;
		}
		// 0 1 2 3
		newNode.next = head;
		Node1 current = head;
		while (current.next != head) {
			current = current.next;
		}
		head = newNode;
		current.next = head;
	}

	public static void insertAtTail(int val) {
		Node1 newNode = new Node1(val);
		if (head == null) {
			head = newNode;
			head.next = head;
		}

		Node1 current = head;
		while (current.next != head) {
			current = current.next;
		}
		current.next = newNode;
		newNode.next = head;
	}

	public static void insertAtPosition(int val, int position) {

		if (position < 0) {
			System.out.println("Invalid position.");
			return;
		}

		Node1 newNode = new Node1(val);

		if (head == null) {
			head = newNode;
			head.next = head;
			return;
		}

		if (position == 0) {
			insertAtHead(val);
			return;
		}

		int currentPosition = 0;
		Node1 current = head;
		while (current.next != head && currentPosition < position - 1) {
			currentPosition++;
			current = current.next;
		}

		newNode.next = current.next;
		current.next = newNode;

		// 0 1 2 3 4 5
	}

	public static void deleteNode(int val) {
		if (head == null) {
			System.out.println("List is empty ");
			return;
		}

		Node1 current = head;
		Node1 prev = head;

		if (head.val == val) {
			
			if(head.next == head) {
				head = null;
			}
			else {
				while (current.next != head) {
					current = current.next;
				}
				head = head.next;
				current.next = head;
			}
			return;
			
		}

		while (current.next != head && current.val != val) {
			prev = current;
			current = current.next;
		}
		if (current.val == val) {
			if (current.next == head) {
				prev.next = head;
			} else {
				prev.next = current.next;
			}
		} else {
			System.out.println("Node not found ");
		}

		// 1 2 3 4 5
	}

	public static void traverse() {

		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node1 current = head;
		System.out.print("List Nodes are :  ");
		System.out.print(current.val + " ");
		while (current.next != head) {
			current = current.next;
			System.out.print(current.val + " ");
		}
		System.out.println();

		// 1 2 3
	}

	public static int findLength() {
		int length = 0;
		if (head == null) {
			return length;
		}

		Node1 current = head;
		while (current.next != head) {
			length++;
			current = current.next;
		}
		return length + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insertAtHead(30);
		insertAtHead(20);
		insertAtHead(10);
		traverse();
		System.out.println("length : " + findLength());
//
//		insertAtTail(40);
//		insertAtTail(50);
//		traverse();
//		System.out.println("length : " + findLength());

		insertAtPosition(400, 4);
		traverse();
		System.out.println("length : " + findLength());

		System.out.println("delete 100 : ");
		deleteNode(100);
		traverse();
		System.out.println("length : " + findLength());
		
		System.out.println("delete 400 : ");
		deleteNode(400);
		traverse();
		System.out.println("length : " + findLength());
		
		System.out.println("delete 10 : ");
		deleteNode(10);
		traverse();
		System.out.println("length : " + findLength());

	}

}
