package Practice;

public class CircularLinkedList {

	static Node head;
	// 0 1 2 3 4

	public static void insertAtBegin(int val) {
		Node newNode = new Node(val);

		if (head == null) {
			head = newNode;
			head.next = head;
			return;
		}
		// 0 1 2 3
		newNode.next = head;
		Node current = head;
		while (current.next != head) {
			current = current.next;
		}
		head = newNode;
		current.next = head;
	}

	public static void insertAtEnd(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			head.next = head;
		}
		
		Node current = head;
		while(current.next != head) {
			current = current.next;
		}
		current.next = newNode;
		newNode.next = head;
	}

	public static void insertAtAnyPosition(int val, int position) {

	}

	public static void traverse() {

		if (head == null) {
			return;
		}

		Node current = head;
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
		if(head == null) {
			return length;
		}
		
		Node current = head;
		while(current.next != head) {
			length++;
			current = current.next;
		}
		return length+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insertAtBegin(30);
		insertAtBegin(20);
		insertAtBegin(10);
		traverse();
		System.out.println("length : " + findLength());
		
		insertAtEnd(40);
		insertAtEnd(50);
		traverse();
		System.out.println("length : " + findLength());
	}

}
