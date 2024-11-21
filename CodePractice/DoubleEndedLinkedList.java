package Practice;

class TwoWayNode {
	int val;
	TwoWayNode next;
	TwoWayNode prev;

	TwoWayNode(int val) {
		this.val = val;
		this.next = null;
		this.prev = null;
	}

}

public class DoubleEndedLinkedList {
	static TwoWayNode head;

	public static void insertAtBegin(int val) {

		TwoWayNode newNode = new TwoWayNode(val);
		if (head == null) {
			head = newNode;
			return;
		}

		head.prev = newNode;
		newNode.next = head;
		head = newNode;

		// 1 2 3
	}

	public static void insertAtEnd(int val) {
		TwoWayNode newNode = new TwoWayNode(val);
		if (head == null) {
			head = newNode;
			return;
		}

		TwoWayNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		newNode.prev = current;
		current.next = newNode;
	}

	public static void insertAtAnyPosition(int val, int position) {
		TwoWayNode newNode = new TwoWayNode(val);
		if (head == null) {
			head = newNode;
			return;
		}

		int currentPosition = 0;
		TwoWayNode current = head;
		TwoWayNode prev = head;

		while (currentPosition < position - 1 && current != null) {
			prev = current;
			current = current.next;
			currentPosition++;
		}

		if(current.next != null) {
			newNode.next = current.next;
			newNode.prev = current;
			current.next.prev = newNode;
			current.next = newNode;
		}
		else {
			newNode.next = null;
			newNode.prev = current;
			current.next = newNode;
		}
		// 0 1 2 3 4 5
		//      7
	}

	public static void traverse() {
		TwoWayNode current = head;
		while (current != null) {
			System.out.println(current.val + " ");
			current = current.next;
		}

	}

	public static void main(String[] args) {

//		insertAtEnd(0);
//		insertAtEnd(50);
//		insertAtBegin(20);
//		insertAtBegin(10);
//		traverse();
//
//		insertAtEnd(30);
//		insertAtEnd(40);
//		traverse();
//
//		insertAtAnyPosition(100, 3);
//		traverse();

		insertAtEnd(0);
		insertAtEnd(10);
		insertAtEnd(20);
		insertAtEnd(30);
		insertAtEnd(40);
		insertAtEnd(50);
		traverse();

		insertAtAnyPosition(70, 4);
		insertAtAnyPosition(80, 7);
		traverse();

	}
}
