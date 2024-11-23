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

		if (current.next != null) {
			newNode.next = current.next;
			newNode.prev = current;
			current.next.prev = newNode;
			current.next = newNode;
		} else {
			newNode.next = null;
			newNode.prev = current;
			current.next = newNode;
		}
		// 0 1 2 3 4 5
		// 7
	}

	public static void deleteNode(int val) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		if(head.val == val) {
			head = head.next;
			head.prev = null;
			return;
		}
		
		TwoWayNode current = head;
		TwoWayNode prev = head;
		while(current.val != val && current.next != null) {
			prev = current;
			current = current.next;
		}
		if(current.val == val ) {
			if(current.next == null) {
				prev.next = null;
			}else {
				prev.next = current.next;
				current.next.prev = prev;
			}
		}
		else {
			System.out.println("Node not found ");
		}
		
		// 1 2 3 4 5
	}

	public static void traverse() {
		TwoWayNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static int findLength() {
		int length = 0;
		if (head == null) {
			return length;
		}

		TwoWayNode current = head;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}

	public static void main(String[] args) {

//		insertAtEnd(0);
//		insertAtEnd(500);
//		insertAtBegin(200);
//		insertAtBegin(100);
//		traverse();
//		System.out.println("length : " + findLength());
//
//		insertAtEnd(30);
//		insertAtEnd(40);
//		traverse();
//		System.out.println("length : " + findLength());
//
//		insertAtAnyPosition(1000, 3);
//		traverse();
//		System.out.println("length : " + findLength());

		insertAtEnd(0);
		insertAtEnd(10);
		insertAtEnd(20);
		insertAtEnd(30);
		insertAtEnd(40);
		insertAtEnd(50);
		traverse();
		findLength();
		System.out.println("length : " + findLength());

		insertAtAnyPosition(70, 4);
		insertAtAnyPosition(80, 7);
		traverse();
		System.out.println("length : " + findLength());
		
		System.out.print("deleteNode(70) : ");
		deleteNode(70);
		traverse();
		System.out.println("length : " + findLength());
		
		System.out.print("deleteNode(0) : ");
		deleteNode(0);
		traverse();
		System.out.println("length : " + findLength());

		System.out.print("deleteNode(80) : ");
		deleteNode(80);
		traverse();
		System.out.println("length : " + findLength());
		
		System.out.print("deleteNode(800) : ");
		deleteNode(800);
		traverse();
		System.out.println("length : " + findLength());

	}
}